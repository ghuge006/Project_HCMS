package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Department;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class DepartmentDAOimpl implements DepartmentDAO {

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Department> getAllDepartment() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Departments", Department.class).getResultList();
	}

	@Override
	public void addDepartment(Department dept) {
		entityManager.unwrap(Session.class).saveOrUpdate(dept);
		
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
