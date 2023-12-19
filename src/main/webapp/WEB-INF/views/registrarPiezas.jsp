<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
<title>Registrar Piezas Fabricadas</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>

</style>
</head>
<body>

    <h1>Registrar Piezas Fabricadas</h1>

    <form method="post" action="/idat/piezas/registrarPiezas">
	    <label for="fechaFabricacion">Fecha de Fabricación:</label>
	    <input type="date" id="fechaFabricacion" name="fechaFabricacion" required><br><br>
	    
	    <label for="idFabrica">ID de Fábrica:</label>
	    <input type="number" id="idFabrica" name="idFabrica" required><br><br>
	    
	    <label for="idLinea">ID de Línea:</label>
	    <input type="number" id="idLinea" name="idLinea" required><br><br>
	    
	    <label for="cantidad">Cantidad:</label>
	    <input type="number" id="cantidad" name="cantidad" required><br><br>
	    
	    <button type="submit">Guardar</button>
	</form>

</body>
</html>