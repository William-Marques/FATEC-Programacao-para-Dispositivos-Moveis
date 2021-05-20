<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Terceiros"%>
<%@page import="revisaodm2021n.controles.ControleTerceiros"%>

<%
    request.setCharacterEncoding("UTF-8");
    int id = Integer.parseInt(request.getParameter("ID"));
    String nome = request.getParameter("NOME");
    String dataNascimento = request.getParameter("DATA");
    String cpf = request.getParameter("CPF");
    String genero = request.getParameter("GENERO");
    String endereco = request.getParameter("ENDERECO");
    String telefone = request.getParameter("TELEFONE");
    String email = request.getParameter("EMAIL");
    String empresa = request.getParameter("EMPRESA");
    String tipo = request.getParameter("TIPO");

    Terceiros terceirosEntrada = new Terceiros(id,nome,dataNascimento,cpf,genero,endereco,telefone,email,empresa,tipo);
    ControleTerceiros terceirosControle = new ControleTerceiros();
    Terceiros terceirosSaida = terceirosControle.alterar(terceirosEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Alterar Terceiros</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=terceirosSaida.getId()%> <br>
        NOME = <%=terceirosSaida.getNome()%> <br>
        DATA DE NASCIMENTO = <%=terceirosSaida.getDataNascimento()%> <br>
        CPF = <%=terceirosSaida.getCpf()%> <br>
        GENERO = <%=terceirosSaida.getGenero()%> <br>
        ENDERECO = <%=terceirosSaida.getEndereco()%> <br>
        TELEFONE = <%=terceirosSaida.getTelefone()%> <br>
        EMAIL = <%=terceirosSaida.getEmail()%> <br>
        EMPRESA = <%=terceirosSaida.getEmpresa()%> <br>
        TIPO = <%=terceirosSaida.getTipo()%> <br>
        <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
