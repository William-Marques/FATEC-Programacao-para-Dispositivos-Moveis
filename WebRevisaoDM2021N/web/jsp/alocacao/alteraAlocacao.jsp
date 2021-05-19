<%@page import="revisaodm2021n.controles.ControleAlocacao"%>
<%@page import="revisaodm2021n.dados.Alocacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Alocacao alocacaoEntrada = new Alocacao(id);
    ControleAlocacao controleAlocacao = new ControleAlocacao();
    Alocacao alocacaoSaida = controleAlocacao.buscar(alocacaoEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Alterar Alocação</title>
    <body>
        <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraAlocacao" action="validaAlteraAlocacao.jsp" method="post">
            ID <%=alocacaoSaida.getId()%> <br>
            ID DO TERCEIRO <input type="text" name="NOMEDOTERCEIRO" value="<%=alocacaoSaida.getTerceiros_id()%>"> <br>            
            ID DA EMPRESA <input type="text" name="NOMEDAEMPRESA" value="<%=alocacaoSaida.getEmpresa_id()%>"> <br>            
            DATA DE ENTRADA <input type="text" name="DATADAENTRADA" value="<%=alocacaoSaida.getDataentrada()%>"> <br>
            DATA DE SAIDA <input type="text" name="DATADASAIDA" value="<%=alocacaoSaida.getDatasaida()%>"> <br>            

            <input type="hidden" name="ID" value="<%=alocacaoSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
</body>
</html>