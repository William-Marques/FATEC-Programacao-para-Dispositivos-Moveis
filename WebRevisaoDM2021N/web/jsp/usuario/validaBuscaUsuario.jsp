<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 20:09:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Usuario"%>
<%@page import="revisaodm2021n.controles.ControleUsuario"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Usuario uEntrada = new Usuario(id);
    ControleUsuario contUsu = new ControleUsuario();
    Usuario uSaida = contUsu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(uSaida != null) { %>
            Usuario = <%=uSaida.getId()%> | <%=uSaida.getLogin()%> | <%=uSaida.getSenha()%> | <%=uSaida.getStatus()%> | <%=uSaida.getTipo()%> <br>   
        <% } else { %>
            Usuário Inválido
        <% } %>
    </div>
    </body>
</html>
