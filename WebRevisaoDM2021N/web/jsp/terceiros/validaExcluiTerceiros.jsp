<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Terceiros"%>
<%@page import="revisaodm2021n.controles.ControleTerceiros"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Terceiros terceirosEntrada = new Terceiros(id);
    ControleTerceiros terceirosControle = new ControleTerceiros();
    Terceiros terceirosSaida = terceirosControle.excluir(terceirosEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Excluir Terceiros</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=terceirosSaida.getId()%> <br>
        NOME = <%=terceirosSaida.getNome()%> <br>
        DATA DE NASCIMENTO = <%=terceirosSaida.getDataNascimento()%> <br>
        CPF = <%=terceirosSaida.getCpf()%> <br>
        GENERO = <%=terceirosSaida.getGenero()%> <br>
        ENDEREÇO = <%=terceirosSaida.getEndereco()%> <br>
        TELEFONE = <%=terceirosSaida.getTelefone()%> <br>
        EMAIL = <%=terceirosSaida.getEmail()%> <br>
        EMPRESA = <%=terceirosSaida.getEmpresa()%> <br>
        TIPO = <%=terceirosSaida.getTipo()%> <br>
        <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
