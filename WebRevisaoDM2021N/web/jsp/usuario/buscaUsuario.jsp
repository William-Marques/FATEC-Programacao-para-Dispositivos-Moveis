<%-- 
    Document   : buscaUsuario
    Created on : 09/04/2021, 20:09:44
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>BUSCA</h1>
        <form name="BUSCA" action="validaBuscaUsuario.jsp" method="post">
            ID <input type="text" name="ID" value=""> <br>
            <input type="submit" name="ENTRAR" value="ENTRAR">
        </form>
    </div>
    </body>
</html>
