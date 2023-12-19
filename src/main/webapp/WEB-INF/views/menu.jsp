<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Menú de Piezas</title>
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
        <h1 class="text-center">Menú de Piezas</h1>
        <p class="text-center">Sede: ${fabrica.sucursal}</p>

        <!-- Botón para buscar piezas -->
        <div class="d-grid gap-2">
            <form action="/idat/piezas/buscarPiezas">
                <button type="submit" class="btn btn-vintage btn-lg">Buscar Piezas</button>
            </form>

            <!-- Botón para registrar piezas -->
            <form action="/idat/piezas/registrarPiezas">
                <button type="submit" class="btn btn-vintage btn-lg">Registrar Piezas</button>
            </form>
        </div>
    </div>
</body>
</html>