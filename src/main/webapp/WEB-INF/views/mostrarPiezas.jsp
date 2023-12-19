<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Piezas encontradas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
        
        
            background: #dfdcdc;
            background: linear-gradient(to right, #dfdcdc, #60A5FA);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .card {
            border-radius: 15px;
        }
        .card-header {
            background: transparent;
            border: none;
            margin: 20px;
        }
        table {
            width: 100%;
            margin-bottom: 1rem;
            color: #212529;
        }
        tr:hover td{
		background-color: #e1e1e1;
	}
    </style>
</head>
<body style="display: flex; flex-direction: column; align-items: center">

<div class="card">
    <div class="card-header">
        <h1>Piezas encontradas</h1>
    </div>
    <div class="card-body">
        <%-- Verificar si hay piezas para mostrar --%>
        <% if (request.getAttribute("piezas") != null) {
            List<com.idat.entity.PiezaFabricada> piezas = (java.util.List<com.idat.entity.PiezaFabricada>) request.getAttribute("piezas");
            if (!piezas.isEmpty()) { %>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID Pieza</th>
                            <th>Cantidad</th>
                            <th>Fecha Fabricación</th>
                            <th>Fabrica</th>
                            <th>Linea</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (com.idat.entity.PiezaFabricada pieza : piezas) { %>
                            <tr>
                                <td><%= pieza.getId_pieza() %></td>
                                <td><%= pieza.getCantidad() %></td>
                                <td><%= pieza.getFecha_fabricacion() %></td>
                                <td><%= pieza.getFabrica().getSucursal() %></td>
                                <td><%= pieza.getLinea().getNombre() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } else { %>
                <p>No se encontraron piezas para el rango de fechas proporcionado.</p>
            <% }
        } else { %>
            <p>No se encontraron piezas para el rango de fechas proporcionado.</p>
        <% } %>
    </div>
	    <div style="display: flex; flex-direction: column; align-items: center">
		<form method="get" action="/idat/piezas/registrarPiezas">
		    <button type="submit" class="btn btn-secondary" >Registrar piezas</button>
		</form>
		 
		<form method="get" action="/idat/piezas/buscarPiezas">
		    <button type="submit" class="btn btn-secondary">Buscar piezas</button>
		</form>
	</div>
	</div>


</body>
</html>