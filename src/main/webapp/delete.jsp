<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter the id to delete</h1>
	<form action="delete" method="post">
		Id: <input type="number" name="id"
			value="<%=request.getParameter("id")%>"> <br> <br>
		<input type="submit">
	</form>

</body>
</html>