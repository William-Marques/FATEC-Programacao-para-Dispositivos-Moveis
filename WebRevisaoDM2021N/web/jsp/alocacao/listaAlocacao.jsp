<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>LISTA</h1>
        <FORM name="validaListaAlocacao" action="validaListaAlocacao.jsp" method="post">
            NOME DO TERCEIRO : <input type="text" name ="NOMEDOTERCEIRO" value=""> <br>
            <input type="submit" name ="ENTRAR" value="ENTRAR">
        </FORM>
    </div>
    </body>
</html>
