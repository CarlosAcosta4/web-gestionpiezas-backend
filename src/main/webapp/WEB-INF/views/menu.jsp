<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú de Piezas</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<!-- Botón para listar piezas -->
<form action="/idat/piezas/todasPiezas">
    <button type="submit">Listar Piezas</button>
</form>

<!-- Botón para buscar piezas -->
<form action="/idat/piezas/buscarPiezas">
    <button type="submit">Buscar Piezas</button>
</form>

<!-- Botón para registrar piezas -->
<form action="/idat/piezas/registrarPiezas">
    <button type="submit">Registrar Piezas</button>
</form>

</body>
</html>