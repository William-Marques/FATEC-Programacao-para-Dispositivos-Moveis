<%@page import="revisaodm2021n.controles.ControleTerceiros"%>
<%@page import="revisaodm2021n.dados.Terceiros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Terceiros terceirosEntrada = new Terceiros(id);
    ControleTerceiros controleTerceiros = new ControleTerceiros();
    Terceiros terceirosSaida = controleTerceiros.buscar(terceirosEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Alterar Terceiros</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraTerceiros" action="validaAlteraTerceiros.jsp" method="post">
            ID <%=terceirosSaida.getId()%> <br>
            NOME <input type="text" name="NOME" value="<%=terceirosSaida.getNome()%>"> <br>
            DATANASCIMENTO <input type="text" name="DATA" value="<%=terceirosSaida.getDataNascimento()%>"> <br>
            CPF <input type="text" name="CPF" value="<%=terceirosSaida.getCpf()%>"> <br>
            GENERO <input type="text" name="GENERO" value="<%=terceirosSaida.getGenero()%>"> <br>
            ENDERECO <input type="text" name="ENDERECO" value="<%=terceirosSaida.getEndereco()%>"> <br>
            TELEFONE <input type="text" name="TELEFONE" value="<%=terceirosSaida.getTelefone()%>"> <br>
            EMAIL <input type="text" name="EMAIL" value="<%=terceirosSaida.getEmail()%>"> <br>
            EMPRESA <input type="text" name="EMPRESA" value="<%=terceirosSaida.getEmpresa()%>"> <br>
            TIPO <input type="text" name="TIPO" value="<%=terceirosSaida.getTipo()%>"> <br>
            
            <input type="hidden" name="ID" value="<%=terceirosSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>