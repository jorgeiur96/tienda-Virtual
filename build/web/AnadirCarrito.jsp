<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="Modelo.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/RegistrarCliente.js"></script>
        <jsp:include page="WEB-INF/jspf/plantilla/header.jspf" />
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
        <title>JSP Page</title>
        
    </head>
 
    <%
        String cliente = request.getParameter("cliente");
        Producto p = ProductoBD.listarProductoPorCodigo(request.getParameter("codigoP"));
    %>
    
    <body>
         <div class="modal-dialog ">
          <div class="modal-content">
        <form name="frm" action="Servlet_Producto" method="post" id="frmAnadirCarrito">
            <input type="hidden" name="txtCliente" value="<%=cliente %>">
            <table id="tablaAnadirCarrito">
                <tr>
                    <th colspan="2">
                        <h1>Añadir a carrito</h1>
                    </th>
                </tr>
                <tr>
                    <td colspan="2">
                <dd> <input type="hidden" name="txtCodigo" value="<%=p.getCodigoP() %>" size="20" maxlength="30"> </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna">
                        Nombre producto :
                    </td>
                    <td>
                        <dd> <input type="text" name="txtNombreP" class="campoNoEditable form-control" value="<%=p.getClaseProducto() %> <%=p.getMarcaProducto() %> - <%=p.getDescripcion() %>" 
                               size="60" readonly="readonly"> </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna">
                        Precio producto :
                    </td>
                    <td>
                        <dd> <input type="text" name="txtPrecio" class="campoNoEditable form-control" value="<%=p.getPrecioP() %>" size="20" maxlength="30" readonly="readonly"> </dd>
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna">
                        Cantidad :
                    </td>
                    <td>
                <dd> <input type="number" name="txtCantidad"  class="form-control" value="1" min="1"> </dd>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="Botones">
                        <br>
                        <input type="button" name="btnCancelar" id="btnCancelar" class="button btn btn-danger" value="Cancelar">
                        <input type="submit" name="btnGuardar" id="btnGuardar" class="button btn btn-primary" value="ADD carrito">
                    </td>
                </tr>
                <tr>
                    <td>
                        <br>
                    </td>
                </tr>
            </table>
                    <input type="hidden" name="accion" value="anadirCarrito">
        </form></div></div>
    </body>
</html>
