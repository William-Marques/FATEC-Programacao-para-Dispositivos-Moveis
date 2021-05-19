<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Página de Login</title>
    <body>
    <div class="container"/>
        <h1>LOGIN</h1>
        <form name="LOGIN" action="menu.jsp" method="post">
            Login <input type="text" name="LOGIN" value="" style="width: 300px"> <br>
            Senha <input type="password" name="SENHA" value="" style="width: 300px"> <br>
            <input type="submit" name="ENTRAR" value="ENTRAR">
        </form>
    </div>
    </body>
</html>
