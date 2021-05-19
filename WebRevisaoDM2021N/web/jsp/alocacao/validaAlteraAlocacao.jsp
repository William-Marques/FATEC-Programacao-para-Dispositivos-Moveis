<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Alocacao"%>
<%@page import="revisaodm2021n.controles.ControleAlocacao"%>

<%
    request.setCharacterEncoding("UTF-8");
    int id = Integer.parseInt(request.getParameter("ID"));
    String terceiros_id = request.getParameter("NOMEDOTERCEIRO");    
    String empresa_id = request.getParameter("NOMEDAEMPRESA");    
    String dataentrada = request.getParameter("DATADAENTRADA");
    String datasaida = request.getParameter("DATADASAIDA");      

    Alocacao alocacaoEntrada = new Alocacao(id,terceiros_id,empresa_id,dataentrada,datasaida);
    ControleAlocacao alocacaoControle = new ControleAlocacao();
    Alocacao alocacaoSaida = alocacaoControle.alterar(alocacaoEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Alterar Alocação</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=alocacaoSaida.getId()%> <br>
        ID DO TERCEIRO = <%=alocacaoSaida.getTerceiros_id()%> <br>        
        ID DA EMPRESA = <%=alocacaoSaida.getEmpresa_id()%> <br>        
        DATA DA ENTRADA = <%=alocacaoSaida.getDataentrada()%> <br>
        DATA DA SAIDA = <%=alocacaoSaida.getDatasaida()%> <br>            
    </div>
    </body>
</html>
