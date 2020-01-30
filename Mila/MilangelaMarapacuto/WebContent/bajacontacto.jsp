<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("idcontacto")!=null){ %>
<jsp:useBean id="a1" class="app.modelo.Agenda" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="a1"/>
<jsp:forward page="control?op=2"></jsp:forward>
<%} %>
<form action="bajacontacto.jsp" method="post">
<h1>Baja Contacto</h1>
<br/>
<br/>
Id: <input type="text" name="idcontacto"/><br/>
<br/>
<br/>
<input type="submit" value="Eliminar Contacto"/>
<br/>
<br/>
<br/>
<a href="index.html">Volver al Inicio</a><br>
</form>
</body>
</html>