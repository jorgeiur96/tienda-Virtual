<%@page import="Modelo.ProductoBD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Producto"%>
<%@page import="Modelo.UsuarioBD"%>
<%@page import="Modelo.Usuario"%>
<!DOCTYPE html>
<html>
    
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/Catalogo.js"></script>
        <link type="text/css" rel="stylesheet" href="css/css1.css" />
 <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/media.css">
        <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/logo.ico" />
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/autohidingnavbar.min.js"></script>
        <script src="js/main.js"></script>
        <script src="js/carrito.js"></script>
        
            <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/materialize.min.css">
    <link rel="stylesheet" href="css/material-design-iconic-font.min.css">
    <link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">
    <link rel="stylesheet" href="css/icomoon.css" />
        <title>JSP Page</title>
        
    </head>
    
    <body onload="cargar()">
        
       
        <%
            String codigo = (String)session.getAttribute("parametroCodigo");
            
            Usuario usu = UsuarioBD.listarUsuarioPorCodigo(codigo);
            String cliente = usu.getNombreUsuario() + ", " + usu.getApellidosUsuario();
        %>
        
        <form action="Servlet_Usu" method="post" id="frmCabecera">
            <nav >
        <div class="nav-wrapper"><a href="Catalogo.jsp">
                 <img  class="imglogo" src="assets/logo.png"> </img></a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">                    
                    
                    
                    <input type="hidden" value="<%=codigo %>" name="txtTipo" id="txtTipo">
               
                    
           <input type="hidden" value="<%=usu.getTipoUsuario() %>" name="txtTipo" id="txtTipo">
            
           
                    
                       
                     
               
            
            <table >
                
                <tr>
                    <td>
                        
                        
                         <li><a  href="RegistrarVenta.jsp" class="waves-effect  blue darken-3 btn"><h6 class="white-text">Haz tu pedido</h6></a></li>
                    </td>
                    <td>
                         <a  href="MiPerfil.jsp?codigoU=<%=usu.getCodigoUsuario() %>" class="linktable-cell-td" id="lnkPerfil">Mi cuenta</a>   
                    </td>
                    <td>
                        <a href="CuentaAdministrador.jsp" class="link table-cell-td" id="lnkAdm">Administrar</a>
                    </td>
                    <td>
                        <a href="Login.jsp" class="link table-cell-td" id="lnkLogin">Login</a>
                    </td>
                    <td>
                        <a href="Servlet_Usuario?accion=logout" class="link table-cell-td" id="lnkLogout">Salir</a>
                    </td>
                </tr>
            </table>
            <input type="hidden" name="accion" value="logout">
             </div></nav>
        </form>
                    
                    
                    
                   
                    
                    <br>
                    <br>
                    
                    
                    
                    <div class="row">
    <div class="center-align  ">
        <div class="w3-content w3-display-container" >
        <img class="mySlides" src="assets/img/img_1.jpg">
        <img class="mySlides" src="assets/img/img_2.jpg">
        <img class="mySlides" src="assets/img/img_3.jpg">
        <img class="mySlides" src="assets/img/img_4.jpg">
        <img class="mySlides" src="assets/img/img_5.jpg">

    </div>

      </div>
      </div>
        
                         <h6>Bienvenido  <%if(usu.getNombreUsuario()!=null){%> : <%=usu.getNombreUsuario() %>, <%=usu.getApellidosUsuario() %><%}%></h6>
                       
                   
          <div class="modal-content"> 
              
                    <form id="frmCatalogo" class="form-inline">
            <div class="table-responsive">
                <table width="1000" id="tablaCatalogo"  >
                <tr>
                    <th colspan="3">
                        <h1> Catalogo de productos </h1>
                    </th>
                </tr>
              
                <tbody>
                        <%
                    ArrayList<Producto> lista = ProductoBD.obtenerProductosHabilitados();
                    int salto = 0;
                    for(int i=0; i<lista.size(); i++){
                        Producto p = lista.get(i);
                %>
             
                
                            <th>
                                 
                                 <div class="card  white lighten-5">
                     <div class="card-content black-text">
                                <img src="<%=p.getImagenP() %>" width="256" height="256"><br>
                                <%=p.getClaseProducto()%> <%=p.getMarcaProducto()%> <br>
                                <%=p.getDescripcion()%><br>
                                S/ <%=p.getPrecioP() %><br>
                            <input type="button" class="BotonModificar btn amber" name="btnModificar" value="Modificar" onclick="location.href='ModificarProducto.jsp?codigoP=<%=p.getCodigoP() %>'">
                            <% if (codigo!=null){%>
                            
                            
                            
                           
                            <input type="button" class="btn  waves-effect waves-orange" name="btnADD" value="ADD Carrito" onclick="location.href='AnadirCarrito.jsp?codigoP=<%=p.getCodigoP()%>&&cliente=<%=codigo %>'"><br>
                            <%}%>
                            <%if(codigo==null){%>
                            <input type="button" class="btn  waves-effect waves-orange" name="btnADD" value="ADD Carrito" onclick="location.href='Login.jsp'"><br>
                    <%}%>
                     
                     </div></div>
                            </th>
                    
                <%
                        salto++;
                        if(salto == 3){
                            %>
                            
                            <tr >
                                
                            <%
                            salto = 0;
                        } 
                    }
                %>
                 
                 
                    
                </tbody>
               
            </table>
                </div>
                    </form>  </div>
    </body>
    <jsp:include page="WEB-INF/jspf/plantilla/footer.jspf" />
</html>