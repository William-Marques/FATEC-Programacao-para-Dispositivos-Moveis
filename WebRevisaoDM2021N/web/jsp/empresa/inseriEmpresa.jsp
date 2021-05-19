<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Inserir Empresa</title>
    <body>
    <div class="container"/>
        <h1>INSERI</h1>
        <form name="validaInseriEmpresa" action="validaInseriEmpresa.jsp" method="post">
            NOME <input type="text" name="NOME" value=""> <br>            
            CNPJ <input type="text" name="CNPJ" value=""> <br>            
            ENDERECO <input type="text" name="ENDERECO" value=""> <br>
            TELEFONE <input type="text" name="TELEFONE" value=""> <br>
            EMAIL <input type="text" name="EMAIL" value=""> <br>            
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>