<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Empresa"%>
<%@page import="revisaodm2021n.controles.ControleEmpresa"%>

<%
    request.setCharacterEncoding("UTF-8");
    int id = Integer.parseInt(request.getParameter("ID"));
    String nome = request.getParameter("NOME");    
    String cnpj = request.getParameter("CNPJ");    
    String endereco = request.getParameter("ENDERECO");
    String telefone = request.getParameter("TELEFONE");
    String email = request.getParameter("EMAIL");    

    Empresa empresaEntrada = new Empresa(id,nome,cnpj,endereco,telefone,email);
    ControleEmpresa empresaControle = new ControleEmpresa();
    Empresa empresaSaida = empresaControle.alterar(empresaEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Alterar Empresa</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=empresaSaida.getId()%> <br>
        NOME = <%=empresaSaida.getNome()%> <br>        
        CNPJ = <%=empresaSaida.getCnpj()%> <br>        
        ENDERECO = <%=empresaSaida.getEndereco()%> <br>
        TELEFONE = <%=empresaSaida.getTelefone()%> <br>
        EMAIL = <%=empresaSaida.getEmail()%> <br>        
    </div>
    </body>
</html>
