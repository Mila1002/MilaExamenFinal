<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="app.modelo.Agenda"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de Contactos</h1>
	<%
		ArrayList<Agenda> todos = 
		(ArrayList<Agenda>) request.getAttribute("todos");
	%>
	<table>
		<tr>
			<th>Id Contacto</th>
			<th>nombre</th>
			<th>email</th>
			<th>telefono</th>
	
		</tr>
		
		<%	
		
		for(Agenda e:todos) {
			%>
			
<tr>
<td><%=e.getIdcontacto() %></td>
<td><%=e.getNombre() %></td>
<td><%=e.getEmail() %></td>
<td><%=e.getTelefono() %></td>

</tr>
<%
}
		%>
</table>
</body>
</html>