package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Department;

public interface DepartmentDAO {
	List<Department> getAllDepartment();

	void addDepartment(Department dept);

	void updateDepartment(Department dept);

	void deleteDepartment(int deptId);
	
	Department getDepartmentById(int deptId);
}
