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

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <head>
        <title>CRUD Bittencourt - Inserir Alocação</title>
    </head>
    <body>
        <div class="container">
            <h1>INSERIR</h1>
            <form name="validaInseriAlocacao" action="validaInseriAlocacao.jsp" method="post">
                NOME DO TERCEIRO <select name="IDDOTERCEIRO" class="browser-default" style="width: 300px">
                    <% if (!(listaTerceirosSaida.isEmpty())) { %>
                    <% for (Terceiros ter : listaTerceirosSaida) {%>
                    <option value="<%=ter.getId()%>"><%=ter.getNome()%></option>
                    <% } %>
                    <% } else { %><% }%>
                </select><br>
                NOME DA EMPRESA <select name="IDDAEMPRESA" class="browser-default" style="width: 300px">
                    <% if (!(listaEmpresaSaida.isEmpty())) { %>
                    <% for (Empresa emp : listaEmpresaSaida) {%>
                    <option value="<%=emp.getId()%>"><%=emp.getNome()%></option>
                    <% } %>
                    <% } else { %><% }%>
                </select>                       
                DATA DE ENTRADA <input type="text" name="DATADAENTRADA" value="" style="width: 300px"> <br>
                DATA DE SAIDA <input type="text" name="DATADASAIDA" value="" style="width: 300px"> <br>            
                <input type="submit" name="INSERIR" value="INSERIR"> <br>
            </form>
        </div>
    </body>
</html>