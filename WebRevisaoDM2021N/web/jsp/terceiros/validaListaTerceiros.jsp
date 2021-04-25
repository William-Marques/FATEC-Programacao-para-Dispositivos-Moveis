<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Terceiros" %>
<%@page import="revisaodm2021n.controles.ControleTerceiros" %>

<%
    request.setCharacterEncoding("UTF-8");
    String nome = request.getParameter("NOME");
    Terceiros terceirosEntrada = new Terceiros(nome);
    ControleTerceiros controleTerceiros = new ControleTerceiros();
    List<Terceiros> listaTerceirosSaida = controleTerceiros.listar(terceirosEntrada);
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
                    <TD>NOME</TD>
                    <TD>DATA DE NASCIMENTO</TD>
                    <TD>CPF</TD>
                    <TD>GENERO</TD>
                    <TD>ENDERECO</TD>
                    <TD>TELEFONE</TD>
                    <TD>EMAIL</TD>
                    <TD>EMPRESA</TD>
                    <TD>TIPO</TD>

                </TR>
             <% if(!(listaTerceirosSaida.isEmpty())) { %>
                <% for (Terceiros ter :listaTerceirosSaida){ %>
                <TR>
                    <TD><%=ter.getId()%></TD>
                    <TD><%=ter.getNome()%></TD>
                    <TD><%=ter.getDataNascimento()%></TD>
                    <TD><%=ter.getCpf()%></TD>
                    <TD><%=ter.getGenero()%></TD>
                    <TD><%=ter.getEndereco()%></TD>
                    <TD><%=ter.getTelefone()%></TD>
                    <TD><%=ter.getEmail()%></TD>
                    <TD><%=ter.getEmpresa()%></TD>
                    <TD><%=ter.getTipo()%></TD>
                    <TD><a href="../terceiros/alteraTerceiros.jsp?ID=<%=ter.getId()%>">Altera</a></TD>
                    <TD><a href="../terceiros/validaExcluiTerceiros.jsp?ID=<%=ter.getId()%>">Excluir</a></TD>
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
