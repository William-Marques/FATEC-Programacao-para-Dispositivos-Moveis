<%-- 
    Document   : validaInseriUsuario
    Created on : 08/04/2021, 20:39:51
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Usuario"%>
<%@page import="revisaodm2021n.controles.ControleUsuario"%>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    String status = request.getParameter("STATUS");
    String tipo = request.getParameter("TIPO");

    Usuario uEntrada = new Usuario(login,senha,status,tipo);
    ControleUsuario usuCont = new ControleUsuario();
    Usuario uSaida = usuCont.inserir(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=uSaida.getId()%> <br>
        LOGIN = <%=uSaida.getLogin()%> <br>
        SENHA = <%=uSaida.getSenha()%> <br>
        STATUS = <%=uSaida.getStatus()%> <br>
        TIPO = <%=uSaida.getTipo()%> <br>
    </div>
    </body>
</html>
