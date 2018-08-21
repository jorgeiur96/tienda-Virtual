<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/RegistrarCliente.js"></script>
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
    </head>
    
    <body>
        
                 <div class="modal-dialog ">
          <div class="modal-content">  
                  
        <form name="frm" action="Servlet_Usuario" method="post" id="frmRegistrarUsuario">
            <input type="hidden" name="accion" value="registrar">
            <table id="tablaRegistrarUsuario">
                <tr>
                    <th colspan="3">
                       <h2 class="modal-title text-center text-primary" id="myModalLabel">Registrar Usuarios</h2>
                    </th>
                </tr>
                <tr>
                    <td class="primeraColumna">
                         <div class="form-group">
                        Nombre : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtNombres" id="txtNombre" class="textBox form-control" placeholder="Nombres" size="30" maxlength="50"> </dd>          
                        </div>
                    </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Apellido :</div> 
                    </td>
                    <td>
                        <div class="form-group">
                        <dd> <input type="text" name="txtApellidos" id="txtApellido" class="textBox form-control" placeholder="Apellidos" size="30" maxlength="50"> </dd>
                        </div>
                        </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Dni : </div>
                    </td>
                    <td>
                        <div class="form-group">
                        <dd> <input type="text" name="txtDni" id="txtDni" class="textBox form-control" placeholder="DNI" size="30" maxlength="8"> </dd>
                        </div>
                    </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Email :</div> 
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtEmail" id="txtEmail" class="textBox form-control" placeholder="Correo electronico" size="30" maxlength="50"> </dd>
                        </div> 
                    </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Confirmar Email : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtConfirmarEmail" id="txtConfirEmail" class="textBox form-control" placeholder="Confirme correo electronico" size="30" maxlength="50"> </dd>
                     </div></td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Departamento : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtDepartamento" id="txtDepartamento" class="textBox form-control" placeholder="Departamento" size="30" maxlength="20"> </dd>
                     </div></td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Municipio : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtMunicipio" id="txtProvincia" class="textBox form-control" placeholder="Provincia" size="30" maxlength="20"> </dd>
                    </div> </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                       Barrio : </div>
                    </td>
                    <td><div class="form-group">
                       <dd> <input type="text" name="txtBarrio" id="txtDistrito" class="textBox form-control" placeholder="Distrito" size="30" maxlength="20"> </dd>
                    </div> </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Direccion 1 : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtDireccion1" id="txtDireccion1" class="textBox form-control" placeholder="Direccion 1" size="30" maxlength="50"> </dd>
                    </div></td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Direccion 2 : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtDireccion2" id="txtDireccion2" class="textBox form-control" placeholder="Direccion 2" size="30" maxlength="50"> </dd>
                    </div></td>
                    <td>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"> <div class="form-group">
                        Telefono : </div>
                    </td>
                    <td><div class="form-group">
                      <dd> <input type="text" name="txtTelefono" id="txtTelefono" class="textBox form-control" placeholder="Telefono o Celular" size="30" maxlength="9"> </dd>
                    </div> </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Usuario : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="text" name="txtUsuario" id="txtUsuario" class="textBox form-control" placeholder="Cree un usuario" size="30" maxlength="30"> </dd>
                   </div> </td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                        Contraseña : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="password" name="txtClave" id="txtClave" class="textBox form-control" placeholder="Cree una contraseña" size="30" maxlength="20"> </dd>
                    </div></td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna"><div class="form-group">
                            Confirmar contraseña : </div>
                    </td>
                    <td><div class="form-group">
                        <dd> <input type="password" name="txtConfirmarClave" id="txtConfirClave" class="textBox form-control" placeholder="Confirme su contraseña" size="30" maxlength="20"> </dd>
                        </div></td>
                    <td>
                        <dd> * </dd>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" class="Botones">
                        <br>
                        <input type="button" name="btnCancelar" id="btnCancelar" class="button btn btn-danger" value="Cancelar">
                        <input type="button"   name="btnRegistrar" id="btnRegistrar" class="button btn btn-primary" value="Registrar">
                    </td>
                </tr>
                <tr>
                    <td>
                        <br>
                    </td>
                </tr>
            </table>
        </form></div></div>
    </body>
       <jsp:include page="WEB-INF/jspf/plantilla/footer.jspf" />
</html>