package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.ProductoBD;
import java.util.ArrayList;
import Modelo.Producto;
import Modelo.UsuarioBD;
import Modelo.Usuario;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/Catalogo.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/media.css\">\n");
      out.write("        <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"assets/icons/logo.ico\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/autohidingnavbar.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script src=\"js/carrito.js\"></script>\n");
      out.write("        \n");
      out.write("            <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/materialize.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Indie+Flower\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icomoon.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body onload=\"cargar()\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        ");

            String codigo = (String)session.getAttribute("parametroCodigo");
            
            Usuario usu = UsuarioBD.listarUsuarioPorCodigo(codigo);
            String cliente = usu.getNombreUsuario() + ", " + usu.getApellidosUsuario();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"Servlet_Usu\" method=\"post\" id=\"frmCabecera\">\n");
      out.write("            <nav >\n");
      out.write("        <div class=\"nav-wrapper\"><a href=\"Catalogo.jsp\">\n");
      out.write("                 <img  class=\"imglogo\" src=\"assets/logo.png\"> </img></a>\n");
      out.write("                <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("          \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("           <input type=\"hidden\" value=\"");
      out.print(usu.getTipoUsuario() );
      out.write("\" name=\"txtTipo\" id=\"txtTipo\">\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                    \n");
      out.write("                       \n");
      out.write("                     \n");
      out.write("               \n");
      out.write("            \n");
      out.write("            <table >\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                         <li><a  href=\"RegistrarVenta.jsp\" class=\"waves-effect  blue darken-3 btn\"><h6 class=\"white-text\">Haz tu pedido</h6></a></li>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                         <a  href=\"MiPerfil.jsp?codigoU=");
      out.print(usu.getCodigoUsuario() );
      out.write("\" class=\"linktable-cell-td\" id=\"lnkPerfil\">Mi cuenta</a>   \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"CuentaAdministrador.jsp\" class=\"link table-cell-td\" id=\"lnkAdm\">Administrar</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"Login.jsp\" class=\"link table-cell-td\" id=\"lnkLogin\">Login</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"Servlet_Usuario?accion=logout\" class=\"link table-cell-td\" id=\"lnkLogout\">Salir</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"logout\">\n");
      out.write("             </div></nav>\n");
      out.write("        </form>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("    <div class=\"center-align  \">\n");
      out.write("        <div class=\"w3-content w3-display-container\" >\n");
      out.write("        <img class=\"mySlides\" src=\"assets/img/img_1.jpg\">\n");
      out.write("        <img class=\"mySlides\" src=\"assets/img/img_2.jpg\">\n");
      out.write("        <img class=\"mySlides\" src=\"assets/img/img_3.jpg\">\n");
      out.write("        <img class=\"mySlides\" src=\"assets/img/img_4.jpg\">\n");
      out.write("        <img class=\"mySlides\" src=\"assets/img/img_5.jpg\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("                         <h6>Bienvenido  ");
if(usu.getNombreUsuario()!=null){
      out.write(" : ");
      out.print(usu.getNombreUsuario() );
      out.write(',');
      out.write(' ');
      out.print(usu.getApellidosUsuario() );
}
      out.write("</h6>\n");
      out.write("                       \n");
      out.write("                   \n");
      out.write("          <div class=\"modal-content\"> \n");
      out.write("              \n");
      out.write("                    <form id=\"frmCatalogo\" class=\"form-inline\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table width=\"1000\" id=\"tablaCatalogo\"  >\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"3\">\n");
      out.write("                        <h1> Catalogo de productos </h1>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("              \n");
      out.write("                <tbody>\n");
      out.write("                        ");

                    ArrayList<Producto> lista = ProductoBD.obtenerProductosHabilitados();
                    int salto = 0;
                    for(int i=0; i<lista.size(); i++){
                        Producto p = lista.get(i);
                
      out.write("\n");
      out.write("             \n");
      out.write("                \n");
      out.write("                            <th>\n");
      out.write("                                 \n");
      out.write("                                 <div class=\"card  white lighten-5\">\n");
      out.write("                     <div class=\"card-content black-text\">\n");
      out.write("                                <img src=\"");
      out.print(p.getImagenP() );
      out.write("\" width=\"256\" height=\"256\"><br>\n");
      out.write("                                ");
      out.print(p.getClaseProducto());
      out.write(' ');
      out.print(p.getMarcaProducto());
      out.write(" <br>\n");
      out.write("                                ");
      out.print(p.getDescripcion());
      out.write("<br>\n");
      out.write("                                S/ ");
      out.print(p.getPrecioP() );
      out.write("<br>\n");
      out.write("                            <input type=\"button\" class=\"BotonModificar btn amber\" name=\"btnModificar\" value=\"Modificar\" onclick=\"location.href='ModificarProducto.jsp?codigoP=");
      out.print(p.getCodigoP() );
      out.write("'\">\n");
      out.write("                            ");
 if (codigo!=null){
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <input type=\"button\" class=\"btn  waves-effect waves-orange\" name=\"btnADD\" value=\"ADD Carrito\" onclick=\"location.href='AnadirCarrito.jsp?codigoP=");
      out.print(p.getCodigoP());
      out.write("&&cliente=");
      out.print(cliente );
      out.write("'\"><br>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            ");
if(codigo==null){
      out.write("\n");
      out.write("                            <input type=\"button\" class=\"btn  waves-effect waves-orange\" name=\"btnADD\" value=\"ADD Carrito\" onclick=\"location.href='Login.jsp'\"><br>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                     \n");
      out.write("                     </div></div>\n");
      out.write("                            </th>\n");
      out.write("                    \n");
      out.write("                ");

                        salto++;
                        if(salto == 3){
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <tr >\n");
      out.write("                                \n");
      out.write("                            ");

                            salto = 0;
                        } 
                    }
                
      out.write("\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("                </div>\n");
      out.write("                    </form>  </div>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/jspf/plantilla/footer.jspf", out, false);
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
