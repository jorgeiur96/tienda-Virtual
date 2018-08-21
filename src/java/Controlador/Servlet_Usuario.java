/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Servlet_Usuario", urlPatterns = {"/Servlet_Usuario"})
public class Servlet_Usuario extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String accion = request.getParameter("accion");
            
            if(accion.equals("login")){
                Login(request, response); 
            }
            if(accion.equals("registrar")){
                RegistrarUsuario(request, response); 
            }
            if(accion.equals("logout")){
                Logout(request, response); 
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

    private void RegistrarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
         //To change body of generated methods, choose Tools | Templates.
         
          
        String Nombre = request.getParameter("txtNombres");
        String Apellidos = request.getParameter("txtApellidos");
        String Dni = request.getParameter("txtDni");
        String Email = request.getParameter("txtEmail");
        String Departamento = request.getParameter("txtDepartamento");
        String Municipio = request.getParameter("txtMunicipio");        
        String Direccion1 = request.getParameter("txtDireccion1");
        String Direccion2 = request.getParameter("txtDireccion2");
        String Telefono = request.getParameter("txtTelefono");
        String Usuario = request.getParameter("txtUsuario");
        String Clave = request.getParameter("txtClave");
        String barrio =request.getParameter("txtBarrio");
        Random r = new Random();
        int valorDado = r.nextInt(69999)+1;
        Usuario usu = new Usuario();
        usu.setCodigoUsuario("U"+String.valueOf(valorDado));
        usu.setNombreUsuario(Nombre);
        usu.setApellidosUsuario(Apellidos);
        usu.setDniUsuario(Dni);
        usu.setEmailUsuario(Email);
        usu.setDepartamentoUsuario(Departamento);
        usu.setMunicipioUsuario(Municipio);       
        usu.setDireccion1Usuario(Direccion1);
        usu.setDireccion2Usuario(Direccion2);
        usu.setTelefonoUsuario(Telefono);
        usu.setIdUsuario(Usuario);
        usu.setClaveUsuario(Clave);
        usu.setBarrioUsuario(barrio);
         
        boolean resp = UsuarioBD.RegistrarUsuario(usu);
        if(resp){
            response.sendRedirect("respuesta.jsp?mens='Se ha registrado correctamente'");
        }else{
            response.sendRedirect("respuesta.jsp?mens='Error: Estamos solucionando un problema'"); 
        }
    }

    private void Login(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
      
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
            
        String usuario = request.getParameter("txtUsuario");
        String clave = request.getParameter("txtClave");
            
        try{
            Usuario usu = UsuarioBD.VerificarUsuario(usuario);
            
            if(usuario.equals(usu.getIdUsuario())){
                if(clave.equals(usu.getClaveUsuario())){
                    if("HAB".equals(usu.getEstadoUsuario())){
                        request.getSession().setAttribute("parametroCodigo", usu.getCodigoUsuario());
                        response.sendRedirect("index.jsp");
                    }else{
                        response.sendRedirect("respuesta.jsp?mens='Usted ha sido inhabilitado del sistema"); 
                    }
                }else{
                    response.sendRedirect("respuesta.jsp?mens='Su clave es incorrecto'"); 
                }
            }else{
                response.sendRedirect("respuesta.jsp?mens='Su id de usuario es incorrecto'"); 
            }
            
        }catch(Exception ex){out.println(ex);}
    }

   private void Logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("index.jsp");
    }
    

}
