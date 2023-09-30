<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JWA EJERCICIO 1 API</title>
</head>
<body>

<h2>Java Web Api</h2>

<% out.print("<h3>Ejercicio 1 JSP</h3>"); %>

<% 

String sesionactiva = (String) session.getAttribute("sesionActiva");

if (sesionactiva == null){
	response.sendRedirect("formulario.jsp");
} else {
	String userName = (String) session.getAttribute("usuario");
	String nombre = (String) session.getAttribute("nombre");
	out.print("<h2> " + userName + " - " + nombre + " </h2>");
}



%>

<a href = "Logout">Salir De La Sesion</a>


</body>
</html>