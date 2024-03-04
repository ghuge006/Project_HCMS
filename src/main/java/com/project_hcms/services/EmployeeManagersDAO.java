package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.EmployeeManagers;

public interface EmployeeManagersDAO {

	List<EmployeeManagers> getAllEmployeeManager();

	void addEmployeeManager(EmployeeManagers employeeManager);

	void updateEmployeeManager(EmployeeManagers employeeManager);

	void deleteEmployeeManager(int relationshipId);
	
	EmployeeManagers getEmployeeManagerById(int relationshipId);
}
