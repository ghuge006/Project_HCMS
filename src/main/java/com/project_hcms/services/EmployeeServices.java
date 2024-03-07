package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Employee;

public interface EmployeeServices {

	List<Employee> getAllEmployee();

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void deleteEmployee(Employee emp);
	
	Employee getEmployeeById(int empId);
}
