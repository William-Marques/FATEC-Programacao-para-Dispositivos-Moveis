<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Buscar Empresa</title>
    <body>
    <div class="container"/>
        <h1>BUSCA</h1>
        <form name="BUSCA" action="validaBuscaEmpresa.jsp" method="post">
            ID <input type="text" name="ID" value=""> <br>
            <input type="submit" name="ENTRAR" value="ENTRAR">
        </form>
    </div>
    </body>
</html>
