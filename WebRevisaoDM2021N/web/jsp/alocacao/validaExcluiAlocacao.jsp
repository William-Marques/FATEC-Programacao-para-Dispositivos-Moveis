<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Alocacao"%>
<%@page import="revisaodm2021n.controles.ControleAlocacao"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Alocacao alocacaoEntrada = new Alocacao(id);
    ControleAlocacao alocacaoControle = new ControleAlocacao();
    Alocacao alocacaoSaida = alocacaoControle.excluir(alocacaoEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=alocacaoSaida.getId()%> <br>
        ID DO TERCEIRO = <%=alocacaoSaida.getTerceiros_id()%> <br>
        ID DA EMPRESA = <%=alocacaoSaida.getEmpresa_id()%> <br>        
        DATA DE ENTRADA = <%=alocacaoSaida.getDataentrada()%> <br>
        DATA DE SAIDA = <%=alocacaoSaida.getDatasaida()%> <br>        
    </div>
    </body>
</html>
