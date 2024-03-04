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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
