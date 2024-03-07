package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project_hcms.dao.DepartmentDAO;
import com.project_hcms.entities.Department;

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
		departmentDAO.updateDepartment(dept);

	}

	@Override
	public void deleteDepartment(Department dept) {
		departmentDAO.deleteDepartment(dept);

	}

	@Override
	public Department getDepartmentById(int deptId) {
		// TODO Auto-generated method stub
		return departmentDAO.getDepartmentById(deptId);
	}

}
