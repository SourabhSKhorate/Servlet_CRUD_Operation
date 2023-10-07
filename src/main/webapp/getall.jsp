<%@page import="com.jsp.dto.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is getall page</h1>
	<%
	EmployeeService employeeService = new EmployeeService();
	List<Employee> employees = employeeService.getAllEmployee();
	%>

	<table border="1px" cellspacing="0" cellpadding="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Salary</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>

		<%
		for (Employee e : employees) {
		%>

		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getEmail()%></td>
			<td><%=e.getGender()%></td>
			<td><%=e.getSalary()%></td>
			<td> <a href="delete.jsp?id=<%=e.getId()%>">Delete</a></td>
			<td> <a href="update.jsp?id=<%=e.getId()%>">Update</a></td>

		</tr>
		<%
		}
		%>
	</table>

</body>
</html>