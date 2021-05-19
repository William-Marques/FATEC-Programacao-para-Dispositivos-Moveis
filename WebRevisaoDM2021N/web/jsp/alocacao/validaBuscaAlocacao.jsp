<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Alocacao"%>
<%@page import="revisaodm2021n.controles.ControleAlocacao"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Alocacao alocacaoEntrada = new Alocacao(id);
    ControleAlocacao controleAlocacao = new ControleAlocacao();
    Alocacao alocacaoSaida = controleAlocacao.buscar(alocacaoEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Buscar Alocação</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(alocacaoSaida != null) { %>
            Alocacao = <%=alocacaoSaida.getId()%> | <%=alocacaoSaida.getTerceiros_id()%> |  <%=alocacaoSaida.getEmpresa_id()%> | <%=alocacaoSaida.getDataentrada()%> | <%=alocacaoSaida.getDatasaida()%> <br>   
        <% } else { %>
            Alocacao Inválido
        <% } %>
    </div>
    </body>
</html>
