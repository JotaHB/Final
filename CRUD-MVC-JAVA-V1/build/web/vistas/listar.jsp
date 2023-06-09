<%-- 
    Document   : listar
    Created on : May 27, 2023, 12:13:44 PM
    Author     : Elpepe
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Personas</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>NOMBRES</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    PersonaDAO dao = new PersonaDAO();
                    out.println("Conexión exitosa");
                    List <Persona> list = dao.listar();
                    Iterator <Persona> iter = list.iterator();
                    Persona per = null;
                    while(iter.hasNext()) {
                    per = iter.next();
                    
                %>
                <tbody>
                <tr>
                    <td><%=per.getId()%></td>
                    <td><%=per.getDni()%></td>
                    <td><%=per.getNom()%></td>
                    <td>
                        <a>Editar</a>
                        <a>Remove</a>
                    </td>
                </tr>
                <% } %>
                </tbody>

            </table>
        </div>
    </body>
</html>
