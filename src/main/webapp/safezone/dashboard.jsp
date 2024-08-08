<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="co.app.utils.UserUtils" %>
<%@ page import="co.app.utils.UserUtils.UserInfo" %>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <!-- Agrega aquí cualquier CSS o metadatos que necesites -->
</head>
<body>
    <h2>Dashboard</h2>
    <nav>
        <ul>
            <li><a href="<%=request.getContextPath()%>/safezone/usuarios?action=list">Ver listado de usuarios</a></li>
        </ul>
    </nav>
    <!-- Agrega aquí el contenido adicional que necesites -->

<form action="logout" method="get">
    <input type="submit" value="Cerrar Sesión" >
</form>

<%
    UserInfo userInfo = UserUtils.getUserInfo(request);
    if(userInfo != null) {
        out.println("Username: " + userInfo.getUsername());
        out.println("Role: " + userInfo.getRole());
    } else {
        out.println("User not logged in or session not available.");
    }
%>
</body>
</html>
