<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Empresa"%>
<%@page import="revisaodm2021n.controles.ControleEmpresa"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Empresa empresaEntrada = new Empresa(id);
    ControleEmpresa controleEmpresa = new ControleEmpresa();
    Empresa empresaSaida = controleEmpresa.buscar(empresaEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Buscar Empresa</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(empresaSaida != null) { %>
            Empresa = <%=empresaSaida.getId()%> | <%=empresaSaida.getNome()%> |  <%=empresaSaida.getCnpj()%> | <%=empresaSaida.getEndereco()%> | <%=empresaSaida.getTelefone()%> | <%=empresaSaida.getEmail()%> <br>   
        <% } else { %>
            Empresa Inválido
        <% } %>
        <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
