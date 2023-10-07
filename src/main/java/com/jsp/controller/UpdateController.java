package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

@WebServlet("/update")
public class UpdateController extends HttpServlet {

	EmployeeService employeeService = new EmployeeService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		Integer id1 = Integer.parseInt(id);

		String email = req.getParameter("email");

		Employee employee = new Employee();
		employeeService.updateEmployee(id1, email);
		employee.setEmail(email);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, resp);

	}

}
