<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="co.app.model.Usuario" %>
<%@ page import="co.app.model.Rol" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><%=(request.getAttribute("usuario") != null) ? "Editar Usuario" : "Crear Usuario"%></title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h2><%=(request.getAttribute("usuario") != null) ? "Editar Usuario" : "Crear Usuario"%></h2>
    <form action="../safezone/usuarios?action=<%=(request.getAttribute("usuario") != null) ? "update" : "insert"%>" method="post">
        <%
            if (request.getAttribute("usuario") != null) {
                Usuario usuario = (Usuario) request.getAttribute("usuario");
        %>
            <input type="hidden" name="id" value="<%= usuario.getIdUsuario() %>">
        <%
            }
        %>
        <div>
            <label for="nombreCompleto">Nombre Completo:</label>
            <input type="text" id="nombreCompleto" name="nombreCompleto" value="<%=(request.getAttribute("usuario") != null) ? ((Usuario)request.getAttribute("usuario")).getNombreCompleto() : ""%>" required>
        </div>
        <div>
            <label for="identificacion">Identificación:</label>
            <input type="text" id="identificacion" name="identificacion" value="<%=(request.getAttribute("usuario") != null) ? ((Usuario)request.getAttribute("usuario")).getIdentificacion() : ""%>" required>
        </div>
        <div>
            <label for="correoElectronico">Correo Electrónico:</label>
            <input type="email" id="correoElectronico" name="correoElectronico" value="<%=(request.getAttribute("usuario") != null) ? ((Usuario)request.getAttribute("usuario")).getCorreoElectronico() : ""%>" required>
        </div>
        <div>
            <label for="contrasena">Contraseña:</label>
            <input type="password" id="contrasena" name="contrasena" value="<%=(request.getAttribute("usuario") != null) ? ((Usuario)request.getAttribute("usuario")).getContrasena() : ""%>" required>
        </div>
        <div>
            <label for="codigoRol">Rol:</label>
            <input type="number" id="codigoRol" name="codigoRol" value="<%=(request.getAttribute("usuario") != null) ? ((Usuario)request.getAttribute("usuario")).getCodigoRol() : ""%>" required>
        </div>
        <div>
            <button type="submit"><%=(request.getAttribute("usuario") != null) ? "Actualizar" : "Crear"%></button>
            <a href="../safezone/usuarios">Cancelar</a>
        </div>
    </form>
</body>
</html>
