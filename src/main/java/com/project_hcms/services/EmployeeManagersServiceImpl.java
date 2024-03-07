package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.EmployeeManagersDAO;
import com.project_hcms.entities.EmployeeManagers;
@Service
public class EmployeeManagersServiceImpl implements EmployeeManagersService {

	@Autowired
	EmployeeManagersDAO employeeManagersDAO;
	@Override
	public List<EmployeeManagers> getAllEmployeeManager() {
		// TODO Auto-generated method stub
		return employeeManagersDAO.getAllEmployeeManager();
	}

	@Override
	public void addEmployeeManager(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		employeeManagersDAO.addEmployeeManager(employeeManager);
	}

	@Override
	public void updateEmployeeManager(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		employeeManagersDAO.updateEmployeeManager(employeeManager);
	}

	@Override
	public void deleteEmployeeManager(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		employeeManagersDAO.deleteEmployeeManager(employeeManager);
	}

	@Override
	public EmployeeManagers getEmployeeManagerById(int relationshipId) {
		// TODO Auto-generated method stub
		return employeeManagersDAO.getEmployeeManagerById(relationshipId);
	}

}
