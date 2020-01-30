<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("id")!=null){ %>
<jsp:useBean id="a1" class="app.modelo.Agenda" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="a1"/>
<jsp:forward page="control?op=3"></jsp:forward>
<%} %>
<form action="modificarcontacto.jsp" method="post">

ID: <input type="text" name="id"/>
<br/>
<br/>
Nombre: <input type="text" name="nombre"/><br/>
<br/>
<br/>
Email: <input type="text" name="email"/><br/> 
<br/>
<br/>
Telefono: <input type="text" name="telefono"/><br/> 
<br/>
<br/>
<input type="submit" value="Modificar Contacto"/>
<br/>
</form>
<br/>
<br/>
<a href="index.html">Volver al Inicio</a><br>

</body>
</html>