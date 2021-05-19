<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <head>
    <title>CRUD Bittencourt - Inserir Alocação</title>
    </head>
    <body>
        <div class="container">
        <h1>INSERIR</h1>
        <form name="validaInseriAlocacao" action="validaInseriAlocacao.jsp" method="post">
            ID DO TERCEIRO <input type="text" name="IDDOTERCEIRO" value=""> <br>
            <select name="NOMEDOTERCEIRO" id="teste" form="validaInserirAlocacao">
                <option value="teste">teste</option>
                <option value="teste2">teste2</option>
            </select>            
            ID DA EMPRESA <input type="text" name="IDDAEMPRESA" value=""> <br>            
            DATA DE ENTRADA <input type="text" name="DATADEENTRADA" value=""> <br>
            DATA DE SAIDA <input type="text" name="DATADESAIDA" value=""> <br>            
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
</body>
</html>