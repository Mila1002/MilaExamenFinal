<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a1" class="app.modelo.Agenda" scope="request"></jsp:useBean>
Datos: 
<br>
<br>
<%=a1.toString()%>
<br>
<br>

<%=request.getAttribute("mensaje")%>
<br>
<br>
<a href="index.html">Volver al Inicio</a><br>
</body>
</html>