package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.EmployeeManagers;

public interface EmployeeManagersService {

	List<EmployeeManagers> getAllEmployeeManager();

	void addEmployeeManager(EmployeeManagers employeeManager);

	void updateEmployeeManager(EmployeeManagers employeeManager);

	void deleteEmployeeManager(EmployeeManagers employeeManager);
	
	EmployeeManagers getEmployeeManagerById(int relationshipId);
}
