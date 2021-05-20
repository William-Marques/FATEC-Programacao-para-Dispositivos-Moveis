<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Terceiros"%>
<%@page import="revisaodm2021n.controles.ControleTerceiros"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Terceiros terceirosEntrada = new Terceiros(id);
    ControleTerceiros controleTerceiros = new ControleTerceiros();
    Terceiros terceirosSaida = controleTerceiros.buscar(terceirosEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Buscar Terceiros</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(terceirosSaida != null) { %>
            Terceiros = <%=terceirosSaida.getId()%> | <%=terceirosSaida.getNome()%> | <%=terceirosSaida.getDataNascimento()%> | <%=terceirosSaida.getCpf()%> | <%=terceirosSaida.getGenero()%> | <%=terceirosSaida.getEndereco()%> | <%=terceirosSaida.getTelefone()%> | <%=terceirosSaida.getEmail()%> | <%=terceirosSaida.getEmpresa()%> | <%=terceirosSaida.getTipo()%> <br>   
        <% } else { %>
            Terceiros Inválido
        <% } %>
        <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
