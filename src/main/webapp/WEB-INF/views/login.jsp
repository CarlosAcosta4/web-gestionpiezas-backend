<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Iniciar sesi�n</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilologin.css">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-lg">
                <div class="card-header text-center">
                    <h4 class="text-uppercase text-dark">Iniciar sesi�n</h4>
                    <img src="${pageContext.request.contextPath}/css/login.jpg" alt="Descripci�n de la imagen" style="max-width: 300px; height: 300px;margin: 0 auto; display: block;"/>
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

