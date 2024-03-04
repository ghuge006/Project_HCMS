package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project_hcms.dao.DepartmentDAO;
import com.project_hcms.entities.Department;

import jakarta.transaction.Transactional;
@Service
public class DepartmentServicesImpl implements DepartmentServices {

	@Autowired
	DepartmentDAO departmentDAO;

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return departmentDAO.getAllDepartment();
	}

	@Override
	public void addDepartment(Department dept) {
		departmentDAO.addDepartment(dept);
		
	}

	@Override
	public void updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDepartment(int deptId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department getDepartmentById(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
