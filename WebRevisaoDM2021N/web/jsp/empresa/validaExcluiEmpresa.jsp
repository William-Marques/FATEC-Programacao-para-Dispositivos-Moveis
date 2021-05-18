<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Empresa"%>
<%@page import="revisaodm2021n.controles.ControleEmpresa"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Empresa empresaEntrada = new Empresa(id);
    ControleEmpresa empresaControle = new ControleEmpresa();
    Empresa empresaSaida = empresaControle.excluir(empresaEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=empresaSaida.getId()%> <br>
        NOME = <%=empresaSaida.getNome()%> <br>
        CNPJ = <%=empresaSaida.getCnpj()%> <br>        
        ENDEREÇO = <%=empresaSaida.getEndereco()%> <br>
        TELEFONE = <%=empresaSaida.getTelefone()%> <br>
        EMAIL = <%=empresaSaida.getEmail()%> <br>
    </div>
    </body>
</html>
