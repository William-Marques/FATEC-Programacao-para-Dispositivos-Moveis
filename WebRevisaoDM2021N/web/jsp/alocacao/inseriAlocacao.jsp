<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INSERI</h1>
        <form name="validaInseriAlocacao" action="validaInseriAlocacao.jsp" method="post">
            ID DO TERCEIRO <input type="text" name="IDDOTERCEIRO" value=""> <br>            
            ID DA EMPRESA <input type="text" name="IDDAEMPRESA" value=""> <br>            
            DATA DE ENTRADA <input type="text" name="DATADEENTRADA" value=""> <br>
            DATA DE SAIDA <input type="text" name="DATADESAIDA" value=""> <br>            
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>