<%-- 
    Document   : login
    Created on : 09/04/2021, 20:09:22
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LOGIN</h1>
        <form name="LOGIN" action="menu.jsp" method="post">
            Login = <input type="text" name="LOGIN" value=""> <br>
            Senha = <input type="password" name="SENHA" value=""> <br>
            <input type="submit" name="ENTRAR" value="ENTRAR">
        </form>
    </body>
</html>
