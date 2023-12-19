<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscar Piezas por Fecha</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>

</style>
</head>
<body>

<h1>Buscar Piezas por Fecha</h1>

<form id="buscarPiezasForm" action="/idat/piezas/buscarPiezas" method="post" onsubmit="return validarFechas()">
    <label for="fechaInicio">Fecha de inicio:</label>
    <input type="date" id="fechaInicio" name="fechaInicio" required>
    
    <label for="fechaFin">Fecha de fin:</label>
    <input type="date" id="fechaFin" name="fechaFin" required>
    
    <button type="submit">Buscar</button>
</form>

<script>
function validarFechas() {
    var fechaInicio = document.getElementById("fechaInicio").value;
    var fechaFin = document.getElementById("fechaFin").value;

    if (fechaInicio > fechaFin) {
        alert("La fecha de inicio debe ser anterior a la fecha de fin.");
        return false; // Evita que se envíe el formulario si las fechas no son válidas
    }

    return true; 
}
</script>

</body>
</html>