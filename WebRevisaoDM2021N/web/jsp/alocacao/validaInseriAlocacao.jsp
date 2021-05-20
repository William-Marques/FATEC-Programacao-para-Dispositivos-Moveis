<%@page import="revisaodm2021n.controles.ControleAlocacao"%>
<%@page import="revisaodm2021n.dados.Alocacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8");    
    String terceiros_id = request.getParameter("IDDOTERCEIRO");    
    String empresa_id = request.getParameter("IDDAEMPRESA");    
    String dataentrada = request.getParameter("DATADAENTRADA");
    String datasaida = request.getParameter("DATADASAIDA");    

    Alocacao alocacaoEntrada = new Alocacao(terceiros_id,empresa_id,dataentrada,datasaida);
    ControleAlocacao alocacaoControle = new ControleAlocacao();
    Alocacao alocacaoSaida = alocacaoControle.inserir(alocacaoEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Inserir Alocação</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=alocacaoSaida.getId()%> <br>
        ID DO TERCEIRO = <%=alocacaoSaida.getTerceiros_id()%> <br>        
        ID DA EMPRESA = <%=alocacaoSaida.getEmpresa_id()%> <br>        
        DATA DE ENTRADA = <%=alocacaoSaida.getDataentrada()%> <br>
        DATA DE SAIDA = <%=alocacaoSaida.getDatasaida()%> <br>
        <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
