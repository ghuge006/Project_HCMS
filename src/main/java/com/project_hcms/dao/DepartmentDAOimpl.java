package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Department;
import com.project_hcms.entities.Employee;

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
		return session.createQuery("from Department", Department.class).getResultList();
	}

	@Override
	public void addDepartment(Department dept) {
		entityManager.unwrap(Session.class).saveOrUpdate(dept);
		
	}

	@Override
	public void updateDepartment(Department dept) {
		entityManager.unwrap(Session.class).merge(dept);
		
	}

	@Override
	public void deleteDepartment(Department dept) {
		entityManager.unwrap(Session.class).remove(dept);
		
	}

	@Override
	public Department getDepartmentById(int deptId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Department.class, deptId);
	}

}
