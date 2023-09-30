<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EJERCICIO 1</title>
</head>
<body>

<h3>Ingreso Al Sistema</h3>

<form action="Login" method ="post">
<label for = "email">Ingresa Tu Mail</label>
<input type = "email" name = "mail" id = "mail" placeholder="mail@gmail.com" required>
<label for = "clave">Ingresa La Clave</label>
<input type = "password" name = "clave" id = "clave" placeholder = "Ingresa Tu Clave" required> 
<button type = "submit">Ingresar</button>
</form>

<%

String mensaje = (String) request.getAttribute("mensajeError");
if (mensaje != null) {
	out.print("<h3> " + mensaje + " </h3>");
}

%>

</body>
</html>