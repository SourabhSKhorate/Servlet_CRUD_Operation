<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Id to Update</h1>
<form action="update" method="post">
Id: <input type= "number" name= "id" value="<%=request.getParameter("id")%>"> <br> <br>
Email: <input type= "email" name= "email"> <br> <br>
<input type= "submit">
</form>

</body>
</html>