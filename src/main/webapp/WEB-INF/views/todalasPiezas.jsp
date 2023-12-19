<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todas las Piezas</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>

</style>
</head>
<body>

<h1>Todas las Piezas</h1>

<%-- Verificar si hay piezas para mostrar --%>
<% if (request.getAttribute("piezas") != null) { %>
    <table border="1">
        <tr>
            <th>ID Pieza</th>
            <th>Cantidad</th>
            <th>Fecha Fabricación</th>
            <th>Fabrica</th>
            <th>Linea</th>
        </tr>
        <% for (com.idat.entity.PiezaFabricada pieza : (List<com.idat.entity.PiezaFabricada>) request.getAttribute("piezas")) { %>
            <tr>
                <td><%= pieza.getId_pieza() %></td>
                <td><%= pieza.getCantidad() %></td>
                <td><%= pieza.getFecha_fabricacion() %></td>
                <td><%= pieza.getFabrica().getSucursal() %></td>
                <td><%= pieza.getLinea().getNombre() %></td>
            </tr>
        <% } %>
    </table>
<% } else { %>
    <p>No se encontraron piezas.</p>
<% } %>

</body>
</html>