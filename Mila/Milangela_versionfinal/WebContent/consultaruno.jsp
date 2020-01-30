<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("id")!=null) {%>
<jsp:useBean id="a1" class="app.modelo.Agenda" scope="request"></jsp:useBean>
<jsp:setProperty property="id" name="a1"/>
<jsp:forward page="control?op=4"></jsp:forward>

<%} %>
<form action="consultaruno.jsp" method="post">
ID: <input type="text" name="id"/><br>
<br>
<input type="submit" value="consultar "/>
</form>
</body>
</html>