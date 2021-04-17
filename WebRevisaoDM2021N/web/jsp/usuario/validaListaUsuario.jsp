<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Usuario" %>
<%@page import="revisaodm2021n.controles.ControleUsuario" %>

<%
    String login = request.getParameter("LOGIN");
    Usuario uEntrada = new Usuario(login);
    ControleUsuario contUsu = new ControleUsuario();
    List<Usuario> usSaida = contUsu.listar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>LISTA</h1> <br>
            <TABLE>
                <TR>
                    <TD>ID</TD>
                    <TD>LOGIN</TD>
                    <TD>SENHA</TD>
                    <TD>STATUS</TD>
                    <TD>TIPO</TD>
                    <TD>ALTERAR</TD>
                    <TD>EXCLUIR</TD>

                </TR>
             <% if(!(usSaida.isEmpty())) { %>
                <% for (Usuario usu :usSaida){ %>
                <TR>
                    <TD><%=usu.getId()%></TD>
                    <TD><%=usu.getLogin()%></TD>
                    <TD><%=usu.getSenha()%></TD>
                    <TD><%=usu.getStatus()%></TD>
                    <TD><%=usu.getTipo()%></TD>
                    <TD><a href="../usuario/alteraUsuario.jsp?ID=<%=usu.getId()%>">Altera</a></TD>
                    <TD><a href="../usuario/validaExcluiUsuario.jsp?ID=<%=usu.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>LISTA VAZIA</TD>
                </TR>
           <% } %>
            </table>
    </div>
    </body>
</html>
