<%@page import="revisaodm2021n.controles.ControleEmpresa"%>
<%@page import="revisaodm2021n.dados.Empresa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8");
    String nome = request.getParameter("NOME");    
    String cnpj = request.getParameter("CNPJ");    
    String endereco = request.getParameter("ENDERECO");
    String telefone = request.getParameter("TELEFONE");
    String email = request.getParameter("EMAIL");    

    Empresa empresaEntrada = new Empresa(nome,cnpj,endereco,telefone,email);
    ControleEmpresa empresaControle = new ControleEmpresa();
    Empresa empresaSaida = empresaControle.inserir(empresaEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Inserir Empresa</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=empresaSaida.getId()%> <br>
        NOME = <%=empresaSaida.getNome()%> <br>        
        CNPJ = <%=empresaSaida.getCnpj()%> <br>        
        ENDERECO = <%=empresaSaida.getEndereco()%> <br>
        TELEFONE = <%=empresaSaida.getTelefone()%> <br>
        EMAIL = <%=empresaSaida.getEmail()%> <br>
        <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
