<%-- 
    Document   : login
    Created on : 09/04/2021, 20:09:22
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>LOGIN</h1>
        <form name="LOGIN" action="menu.jsp" method="post">
            Login <input type="text" name="LOGIN" value=""> <br>
            Senha <input type="password" name="SENHA" value=""> <br>
            <input type="submit" name="ENTRAR" value="ENTRAR">
        </form>
    </div>
    </body>
</html>
