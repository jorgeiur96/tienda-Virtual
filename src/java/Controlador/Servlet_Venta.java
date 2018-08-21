/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.ObtenerCodigo;
import Modelo.Producto;
import Modelo.Venta;
import Modelo.Venta_DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;


public class Servlet_Venta extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
             String accion = request.getParameter("accion");
            
            if(accion.equals("RegistrarVenta")){
                this.RegistrarVenta(request, response); 
            }
           
        }
    }
    
     private void RegistrarVenta(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        ArrayList lista = (ArrayList)session.getAttribute("carrito");
        
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        
        Connection cn;
         Conexion con = new Conexion();
        cn = con.conectar();
         String codigoVentas = ObtenerCodigo.CodigoVenta();
         Venta v = new Venta();
        v.setCliente(request.getParameter("txtCliente")); 
        v.setTotal(Double.parseDouble(request.getParameter("txtTotal")));
        v.setCodigoVenta(codigoVentas);
        
        boolean resp = Venta_DB.insertarVenta(v);
         Producto p=new Producto();
        if(resp){
            // Regostrar detalle vemta
            String CodigoVenta = request.getParameter("txtCodigoV");
            String NombreProducto[] = request.getParameterValues("nombreProd");
            String PrecioProducto[] = request.getParameterValues("precioProd");
            String CantidadProducto[] = request.getParameterValues("cantidadProd");
            String DescuentoProducto[] = request.getParameterValues("descuentoProd");
            String SubTotalProducto[] = request.getParameterValues("subTotalProd");
            
            if("null".equals(CodigoVenta)){
                CodigoVenta = "V0001";
            }
            System.out.println(p.getCodigoP());
           
            System.out.println(""+CodigoVenta);
            String SQL="INSERT INTO DETALLE_VENTA(Codigo_V, Codigo_P, Precio, Cantidad, Descuento, SubTotal) VALUES(?,?,?,?,?,?);";
            for(int i=0; i<NombreProducto.length;i++){
                try{
                  
                    PreparedStatement cs = cn.prepareStatement(SQL);
                    cs.setString(1, CodigoVenta);
                    cs.setString(2, p.getCodigoP());
                    cs.setDouble(3,  Double.parseDouble(PrecioProducto[i]));
                    cs.setDouble(4, Double.parseDouble(CantidadProducto[i]));
                    cs.setDouble(5, Double.parseDouble((DescuentoProducto[i])));
                    cs.setDouble(6, Double.parseDouble((SubTotalProducto[i])));
                    int j = cs.executeUpdate();
                    if(j==1){
                        response.sendRedirect("mensaje2.jsp?mens='Se ha registrado su compra correctamente'"); 
                       lista.clear();
                    }else{
                        response.sendRedirect("mensaje2.jsp?mens='Error al registrar su compra'");
                    }
                }catch(Exception e){System.out.println(e);}
            }
        }else{
            response.sendRedirect("mensaje2.jsp?mens='Error al registrar su compra'");
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

}
