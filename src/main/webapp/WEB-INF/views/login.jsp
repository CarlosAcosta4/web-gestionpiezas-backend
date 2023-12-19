<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Iniciar sesi�n</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: #007BFF;
            background: linear-gradient(to right, #007BFF, #60A5FA);
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
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-lg">
                <div class="card-header text-center">
                    <h4 class="text-uppercase text-dark">Iniciar sesi�n</h4>
                </div>
                <div class="card-body">
                    <c:if test="${param.invalid != null}">
                        <div class="alert alert-danger">Correo electr�nico o contrase�a incorrectos.</div>
                    </c:if>

                    <c:if test="${param.unregistered != null}">
                        <div class="alert alert-danger">Este correo electr�nico no est� registrado.</div>
                    </c:if>

                    <form:form modelAttribute="usuarioL" action="${pageContext.request.contextPath}/login" method="post">
                        <div class="form-group">
                            <label for="email">Correo electr�nico:</label>
                            <form:input path="email" id="email" class="form-control" placeholder="Correo electr�nico" required="required"/>
                        </div>
                        <div class="form-group">
                            <label for="contrasena">Contrase�a:</label>
                            <form:password path="contrasena" id="contrasena" class="form-control" placeholder="Contrase�a" required="required"/>
                        </div>
                        <div class="form-group mt-3">
                            <input type="submit" class="btn btn-dark btn-block" value="Iniciar sesi�n"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>