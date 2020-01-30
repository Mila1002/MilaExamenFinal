<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta Contacto</title>
</head>
<body>
<%if(request.getParameter("nombre")!=null){ %>
<jsp:useBean id="a1" class="app.modelo.Agenda" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="a1"/>
<jsp:forward page="control?op=1"></jsp:forward>
<%} %>
<form 
action="altacontacto.jsp" method="post">
<h1>Alta Contacto</h1>
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

<input type="submit" value="Alta Contacto"/>
<br/>
<br/>
<br/>
<a href="index.html">Volver al Inicio</a><br>
</form>
</body>
</html>