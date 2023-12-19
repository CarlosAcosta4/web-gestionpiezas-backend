<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Buscar Piezas por Fecha</title>
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
        <h1 class="text-center">Buscar Piezas por Fecha</h1>

        <div class="card">
            <div class="card-body">
                <form id="buscarPiezasForm" action="/idat/piezas/buscarPiezas" method="post" onsubmit="return validarFechas()">
                    <div class="mb-3">
                        <label for="fechaInicio" class="form-label">Fecha de inicio:</label>
                        <input type="date" id="fechaInicio" name="fechaInicio" class="form-control" required>
                    </div>
                    
                    <div class="mb-3">
                        <label for="fechaFin" class="form-label">Fecha de fin:</label>
                        <input type="date" id="fechaFin" name="fechaFin" class="form-control" required>
                    </div>
                    
                    <button type="submit" class="btn btn-vintage">Buscar</button>
                </form>
            </div>
        </div>
    </div>

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