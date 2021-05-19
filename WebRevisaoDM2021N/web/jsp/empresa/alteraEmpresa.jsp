<%@page import="revisaodm2021n.controles.ControleEmpresa"%>
<%@page import="revisaodm2021n.dados.Empresa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Empresa empresaEntrada = new Empresa(id);
    ControleEmpresa controleEmpresa = new ControleEmpresa();
    Empresa empresaSaida = controleEmpresa.buscar(empresaEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Alterar Empresa</title>
    <body>
        <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraEmpresa" action="validaAlteraEmpresa.jsp" method="post">
            ID <%=empresaSaida.getId()%> <br>
            NOME <input type="text" name="NOME" value="<%=empresaSaida.getNome()%>"> <br>            
            CNPJ <input type="text" name="CNPJ" value="<%=empresaSaida.getCnpj()%>"> <br>            
            ENDERECO <input type="text" name="ENDERECO" value="<%=empresaSaida.getEndereco()%>"> <br>
            TELEFONE <input type="text" name="TELEFONE" value="<%=empresaSaida.getTelefone()%>"> <br>
            EMAIL <input type="text" name="EMAIL" value="<%=empresaSaida.getEmail()%>"> <br>            

            <input type="hidden" name="ID" value="<%=empresaSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
</body>
</html>