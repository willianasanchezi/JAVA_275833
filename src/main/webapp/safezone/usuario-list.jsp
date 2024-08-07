<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="co.app.model.Usuario" %>
<%@ page import="co.app.model.Rol" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Usuarios</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h2>Lista de Usuarios</h2>
    <a href="../safezone/usuarios?action=new">Crear Nuevo Usuario</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre Completo</th>
            <th>Identificación</th>
            <th>Correo Electrónico</th>
            <th>Rol</th>
            <th>Acciones</th>
        </tr>
        <%
            List<Usuario> listaUsuarios = (List<Usuario>) request.getAttribute("listaUsuarios");
            for(Usuario usuario : listaUsuarios) {
        %>
            <tr>
                <td><%= usuario.getIdUsuario() %></td>
                <td><%= usuario.getNombreCompleto() %></td>
                <td><%= usuario.getIdentificacion() %></td>
                <td><%= usuario.getCorreoElectronico() %></td>
                <td><%= usuario.getCodigoRol() %></td>
                <td>
                    <a href="../safezone/usuarios?action=edit&id=<%= usuario.getIdUsuario() %>">Editar</a>
                    <a href="../safezone/usuarios?action=delete&id=<%= usuario.getIdUsuario() %>" onclick="return confirm('¿Estás seguro de que deseas eliminar este usuario?');">Eliminar</a>
                </td>
            </tr>
        <%
            }
        %>
    </table>
    <nav>
        <form action="../safezone/dashboard" method="get">
            <input type="submit" value="Menu Principal">
        </form>
    </nav>
</body>
</html>
