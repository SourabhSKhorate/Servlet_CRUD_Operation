package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

//	public Employee getEmployeeById(int id) {
//		Employee employee = entityManager.find(Employee.class, id);
//		return employee;
//	}

	public boolean deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public boolean updateEmployee(int id, String email) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setEmail(email);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		} 
		return false;
	}
	
	public List<Employee> getAllEmployee(){
		String sql= "SELECT e FROM Employee e";
		Query query=entityManager.createQuery(sql);
		
		List<Employee> employees=query.getResultList();
		return employees;
	}

}
