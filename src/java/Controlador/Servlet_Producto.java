/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.ProductoBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge Urueta
 */
public class Servlet_Producto extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String accion = request.getParameter("accion");
           if(accion.equals("anadirCarrito")){
                this.AnadirCarrito(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void AnadirCarrito(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        //To change body of generated methods, choose Tools | Templates.
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        
        HttpSession session = request.getSession();
        ArrayList<DetalleVenta> carritoCompra;
        
        if(session.getAttribute("carrito") == null){
            carritoCompra = new ArrayList<DetalleVenta>();
        }else{
            carritoCompra = (ArrayList<DetalleVenta>)session.getAttribute("carrito");
        }
        
        Producto p = ProductoBD.listarProductoPorCodigo(request.getParameter("txtCodigo")); 
        
        DetalleVenta dv = new DetalleVenta();
        dv.setCodigoProducto(request.getParameter("txtCodigo")); 
        dv.setNombreProducto(request.getParameter("txtNombreP")); 
        dv.setPrecio(Double.parseDouble(request.getParameter("txtPrecio")));
        dv.setCantidad(Double.parseDouble(request.getParameter("txtCantidad"))); 
        
        // Realizamos un descuento para el sub total
        double subTotal = p.getPrecioP() * dv.getCantidad();
        if(subTotal > 1000){
            dv.setDescuento(subTotal * 0.25);
        }
        else if(subTotal > 400){
            dv.setDescuento(subTotal * 0.10);
        }
        else{
            dv.setDescuento(0); 
        }
        
        dv.setSubTotal(dv.getPrecio() * dv.getCantidad() - dv.getDescuento());
        
        int indice = -1;
        for(int i=0; i<carritoCompra.size(); i++){
            DetalleVenta det = carritoCompra.get(i);
            if(det.getCodigoProducto().equals(p.getCodigoP())){
                indice = i;
                break;
            }
        }
        
        if(indice == -1){
            dv.setNumero(String.valueOf(carritoCompra.size() + 1)); 
            carritoCompra.add(dv);
        }else{
            dv.setNumero(String.valueOf(indice + 1));
            carritoCompra.set(indice, dv);
        }
        
        session.setAttribute("carrito", carritoCompra); 
        request.getSession().setAttribute("parametroCliente", request.getParameter("txtCliente"));
        response.sendRedirect("RegistrarVenta.jsp");
    
    }

}
