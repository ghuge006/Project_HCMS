package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Employee;

public interface EmployeeDAO {

	List<Employee> getAllEmployee();

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void deleteEmployee(Employee emp);
	
	Employee getEmployeeById(int empId);
}
