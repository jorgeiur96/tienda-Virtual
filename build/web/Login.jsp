<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/Login.js"></script>
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
       
         <header>
 
        <nav>
            <div class="nav-wrapper">
                <a class="brand-logo center">Login</a>
                <ul id="nav-mobile" class="left hide-on-med-and-down">
                    <a  href="index.jsp" class="btn waves-effect blue lighten-2"><h6 class="white-text">Regresar<i class="zmdi zmdi-arrow-left"></i></h6></a>
                    
                    </ul>
            </div>
        </nav>
 
    </header>
    
    <body>
        
     
        
        <div class="section"></div>
           <center>

      <h6 class="indigo-text">Inicie sesion con su cuenta</h6>
      <div class="section"></div>

      <div class="container">
        <div class="z-depth-1 grey lighten-4 row" style="display: inline-block; padding: 2px 70px 2px 70px; border: 2px solid #EEE;">

       
            <form method="post" class="col s12"  action="Servlet_Usuario" id="frmLogin" >
                
                  <div class='row'>  </div>
                <table id="tablaLogin">
                    
                  
                    <tr>
                        <td>
                             
                           
                            
                            
                            <div class='row'>
              <div class='input-field col s12'>
              <input type="text" name="txtUsuario"  id="txtUsuario" class='validate'>
                <label for='password'>Ingrese su Usuario</label>
              </div>
              
            </div>
                            
                            
                            </td>
                    </tr>
                    <tr>
                        <td>
                               <div class='row'>
              <div class='input-field col s12'>
                            <input type="password" name="txtClave"  id="txtClave" class='validate'>
                              <label for='password'>Ingrese su Contraseña</label>
              </div>
                            </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="button"  class="btn btn-primary" name="btnIngresar" value="Ingresar" id="btnIngresar" >
                        </td>
                    </tr>
                    <tr>
                        <td class="centrarBoton">
                            <a href="RegistrarCliente.jsp" id="lnkRegistrarUsuario"><h4>Registrate aqui</h4></a>
                        </td>
                    </tr>
                   
                </table>
                    <input type="hidden" name="accion" value="login">
                   
            </form>
             </div>
      </div>
        <div class="section"></div>
    
  </main>
     
    </center>

            
    </body>
    <jsp:include page="WEB-INF/jspf/plantilla/footer.jspf" />
</html>
