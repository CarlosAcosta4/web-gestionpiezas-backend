<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Piezas encontradas</title>
    <style>
        
    </style>
</head>
<body>

<h1>Piezas encontradas</h1>

<%-- Verificar si hay piezas para mostrar --%>
<% if (request.getAttribute("piezas") != null) {
    List<com.idat.entity.PiezaFabricada> piezas = (java.util.List<com.idat.entity.PiezaFabricada>) request.getAttribute("piezas");
    if (!piezas.isEmpty()) { %>
        <table border="1">
            <tr>
                <th>ID Pieza</th>
                <th>Cantidad</th>
                <th>Fecha Fabricación</th>
                <th>Fabrica</th>
                <th>Linea</th>
            </tr>
            <% for (com.idat.entity.PiezaFabricada pieza : piezas) { %>
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
        <p>No se encontraron piezas para el rango de fechas proporcionado.</p>
    <% }
} else { %>
    <p>No se encontraron piezas para el rango de fechas proporcionado.</p>
<% } %>

</body>
</html>