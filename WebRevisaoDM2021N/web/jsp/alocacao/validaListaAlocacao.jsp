<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Alocacao" %>
<%@page import="revisaodm2021n.controles.ControleAlocacao" %>

<%
    request.setCharacterEncoding("UTF-8");
    String terceiros_id = request.getParameter("NOMEDOTERCEIRO");
    Alocacao alocacaoEntrada = new Alocacao(terceiros_id);
    ControleAlocacao controleAlocacao = new ControleAlocacao();
    List<Alocacao> listaAlocacaoSaida = controleAlocacao.listar(alocacaoEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Listar Alocação</title>
    <body>
    <div class="container"/>
        <h1>LISTA</h1> <br>
            <TABLE>
                <TR>
                    <TD>ID</TD>
                    <TD>NOME DO TERCEIRO</TD>                    
                    <TD>NOME DA EMPRESA</TD>                    
                    <TD>DATA DE ENTRADA</TD>
                    <TD>DATA DE SAIDA</TD>                    
                </TR>
             <% if(!(listaAlocacaoSaida.isEmpty())) { %>
                <% for (Alocacao alo :listaAlocacaoSaida){ %>
                <TR>
                    <TD><%=alo.getId()%></TD>
                    <TD><%=alo.getTerceiros_id()%></TD>                    
                    <TD><%=alo.getEmpresa_id()%></TD>                    
                    <TD><%=alo.getDataentrada()%></TD>
                    <TD><%=alo.getDatasaida()%></TD>                    
                    <TD><a href="../alocacao/alteraAlocacao.jsp?ID=<%=alo.getId()%>">Altera</a></TD>
                    <TD><a href="../alocacao/validaExcluiAlocacao.jsp?ID=<%=alo.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>LISTA VAZIA</TD>
                </TR>
           <% } %>
            </table>
            <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
