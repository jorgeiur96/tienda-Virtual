<%-- 
    Document   : mensaje2
    Created on : 08-nov-2015, 13:46:00
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <jsp:include page="WEB-INF/jspf/plantilla/header.jspf" /></head>
    <body>
        <h1 align="center">
            <%
                if(request.getParameter("mens")!=null){
                    out.println(request.getParameter("mens"));
                }
            %>
        </h1><br>
        <h2 align="center">
            <a href="index.jsp">Regresar al catalogo</a>
        </h2>
    </body>
</html>
