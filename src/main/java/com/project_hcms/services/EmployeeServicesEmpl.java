package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.EmployeeDAO;
import com.project_hcms.entities.Employee;
@Service
public class EmployeeServicesEmpl implements EmployeeServices{

	@Autowired
	private EmployeeDAO employeeDAO; 
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.getAllEmployee();
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeDAO.addEmployee(emp);		
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDAO.updateEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeDAO.deleteEmployee(emp);
		
	}

	@Override
	public Employee getEmployeeById(int empId) {
		
		return employeeDAO.getEmployeeById(empId);
	}
	
	

}
