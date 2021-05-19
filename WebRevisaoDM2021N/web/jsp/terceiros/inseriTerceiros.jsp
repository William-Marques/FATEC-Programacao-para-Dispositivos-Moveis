<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>Inserir Terceiros</title>
    <body>
    <div class="container"/>
        <h1>INSERI</h1>
        <form name="validaInseriTerceiros" action="validaInseriTerceiros.jsp" method="post">
            NOME <input type="text" name="NOME" value=""> <br>
            DATA DE NASCIMENTO <input type="text" name="DATA" value=""> <br>
            CPF <input type="text" name="CPF" value=""> <br>
            GENERO <input type="text" name="GENERO" value=""> <br>
            ENDERECO <input type="text" name="ENDERECO" value=""> <br>
            TELEFONE <input type="text" name="TELEFONE" value=""> <br>
            EMAIL <input type="text" name="EMAIL" value=""> <br>
            EMPRESA <input type="text" name="EMPRESA" value=""> <br>
            TIPO <input type="text" name="TIPO" value=""> <br>            
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>