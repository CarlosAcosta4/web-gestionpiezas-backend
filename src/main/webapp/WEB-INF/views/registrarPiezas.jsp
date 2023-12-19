<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registrar Piezas Fabricadas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f5f5dc;
            font-family: 'Courier New', Courier, monospace;
        }
        .container {
            margin-top: 50px;
        }
        .btn-vintage {
            background-color: #8b4513;
            color: #fff;
            border: none;
        }
        .btn-vintage:hover {
            background-color: #a0522d;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Registrar Piezas Fabricadas</h1>

        <div class="card">
            <div class="card-body">
                <form method="post" action="/idat/piezas/registrarPiezas">
                    <div class="mb-3">
                        <label for="fechaFabricacion" class="form-label">Fecha de Fabricación:</label>
                        <input type="date" id="fechaFabricacion" name="fechaFabricacion" class="form-control" required>
                    </div>
                    
                    <div class="mb-3">
                        <label for="idFabrica" class="form-label">ID de Fábrica:</label>
                        <input type="number" id="idFabrica" name="idFabrica" value="${sessionScope.fabrica.id}" class="form-control" required>
                    </div>
                    
                    <div class="mb-3">
                        <label for="idLinea" class="form-label">ID de Línea:</label>
                        <input type="number" id="idLinea" name="idLinea" class="form-control" required>
                    </div>
                    
                    <div class="mb-3">
                        <label for="cantidad" class="form-label">Cantidad:</label>
                        <input type="number" id="cantidad" name="cantidad" class="form-control" required>
                    </div>
                    
                    <button type="submit" class="btn btn-vintage">Guardar</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>