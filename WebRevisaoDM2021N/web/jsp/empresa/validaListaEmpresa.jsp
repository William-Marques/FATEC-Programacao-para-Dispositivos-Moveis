<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Empresa" %>
<%@page import="revisaodm2021n.controles.ControleEmpresa" %>

<%
    request.setCharacterEncoding("UTF-8");
    String nome = request.getParameter("NOME");
    Empresa empresaEntrada = new Empresa(nome);
    ControleEmpresa controleEmpresa = new ControleEmpresa();
    List<Empresa> listaEmpresaSaida = controleEmpresa.listar(empresaEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Listar Empresa</title>
    <body>
    <div class="container"/>
        <h1>LISTA</h1> <br>
            <TABLE>
                <TR>
                    <TD>ID</TD>
                    <TD>NOME</TD>                    
                    <TD>CNPJ</TD>                    
                    <TD>ENDERECO</TD>
                    <TD>TELEFONE</TD>
                    <TD>EMAIL</TD>
                </TR>
             <% if(!(listaEmpresaSaida.isEmpty())) { %>
                <% for (Empresa emp :listaEmpresaSaida){ %>
                <TR>
                    <TD><%=emp.getId()%></TD>
                    <TD><%=emp.getNome()%></TD>                    
                    <TD><%=emp.getCnpj()%></TD>                    
                    <TD><%=emp.getEndereco()%></TD>
                    <TD><%=emp.getTelefone()%></TD>
                    <TD><%=emp.getEmail()%></TD>
                    <TD><a href="../empresa/alteraEmpresa.jsp?ID=<%=emp.getId()%>">Altera</a></TD>
                    <TD><a href="../empresa/validaExcluiEmpresa.jsp?ID=<%=emp.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>LISTA VAZIA</TD>
                </TR>
           <% } %>
            </table>
            <a href="../../jsp/acesso/menu2.jsp"><button>Menu Principal</button></a>
    </div>
    </body>
</html>
