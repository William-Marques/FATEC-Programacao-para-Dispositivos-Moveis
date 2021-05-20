<%@page import="revisaodm2021n.controles.ControleAlocacao"%>
<%@page import="revisaodm2021n.dados.Alocacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Terceiros" %>
<%@page import="revisaodm2021n.controles.ControleTerceiros" %>
<%@page import="revisaodm2021n.dados.Empresa" %>
<%@page import="revisaodm2021n.controles.ControleEmpresa" %>

<%
    request.setCharacterEncoding("UTF-8");
    String nome = "";
    Terceiros terceirosEntrada = new Terceiros(nome);
    ControleTerceiros controleTerceiros = new ControleTerceiros();
    List<Terceiros> listaTerceirosSaida = controleTerceiros.listar(terceirosEntrada);
%>

<%
    Empresa empresaEntrada = new Empresa(nome);
    ControleEmpresa controleEmpresa = new ControleEmpresa();
    List<Empresa> listaEmpresaSaida = controleEmpresa.listar(empresaEntrada);
%>

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
        <h1>ALTERAR</h1>
        <form name="validaAlteraAlocacao" action="validaAlteraAlocacao.jsp" method="post">
            ID A SER ALTERADA -> <%=alocacaoSaida.getId()%> <br>
            NOME DO TERCEIRO <select name="IDDOTERCEIRO" class="browser-default" style="width: 300px">
                    <% if (!(listaTerceirosSaida.isEmpty())) { %>
                    <% for (Terceiros ter : listaTerceirosSaida) {%>                    
                    <option value="<%=ter.getId()%>" ><%=ter.getNome()%></option>
                    <% } %>
                    <% } else { %><% }%>
                    <option selected value="<%=alocacaoSaida.getTerceiros_id()%>"><%=alocacaoSaida.getTerceiros_id()%></option>
                </select><br>
                NOME DA EMPRESA <select name="IDDAEMPRESA" class="browser-default" style="width: 300px">
                    <% if (!(listaEmpresaSaida.isEmpty())) { %>
                    <% for (Empresa emp : listaEmpresaSaida) {%>                    
                    <option value="<%=emp.getId()%>"><%=emp.getNome()%></option>                    
                    <% } %>
                    <% } else { %><% }%>
                    <option selected value="<%=alocacaoSaida.getEmpresa_id()%>"><%=alocacaoSaida.getEmpresa_id()%></option>
                </select>                       
                DATA DE ENTRADA <input type="text" name="DATADAENTRADA" value="<%=alocacaoSaida.getDataentrada()%>" style="width: 300px"> <br>
                DATA DE SAIDA <input type="text" name="DATADASAIDA" value="<%=alocacaoSaida.getDatasaida()%>" style="width: 300px"> <br>           

            <input type="hidden" name="ID" value="<%=alocacaoSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
</body>
</html>