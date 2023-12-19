<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Iniciar sesión</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilologin.css">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-lg">
                <div class="card-header text-center">
                    <h4 class="text-uppercase text-dark">Iniciar sesión</h4>
                    <img src="${pageContext.request.contextPath}/css/login.jpg" alt="Descripción de la imagen" style="max-width: 300px; height: 300px;margin: 0 auto; display: block;"/>
                </div>
                <div class="card-body">
                    <c:if test="${param.invalid != null}">
                        <div class="alert alert-danger">Correo electrónico o contraseña incorrectos.</div>
                    </c:if>

                    <c:if test="${param.unregistered != null}">
                        <div class="alert alert-danger">Este correo electrónico no está registrado.</div>
                    </c:if>

                    <form:form modelAttribute="usuarioL" action="${pageContext.request.contextPath}/login" method="post">
                        <div class="form-group">
                            <label for="email">Correo electrónico:</label>
                            <form:input path="email" id="email" class="form-control" placeholder="Correo electrónico" required="required"/>
                        </div>
                        <div class="form-group">
                            <label for="contrasena">Contraseña:</label>
                            <form:password path="contrasena" id="contrasena" class="form-control" placeholder="Contraseña" required="required"/>
                        </div>
                        <div class="form-group mt-3">
                            <input type="submit" class="btn btn-dark btn-block" value="Iniciar sesión"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

