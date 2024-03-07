package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.EmployeeManagers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EmployeeManagersDAOImpl implements EmployeeManagersDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<EmployeeManagers> getAllEmployeeManager() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from EmployeeManagers", EmployeeManagers.class).getResultList();
	}

	@Override
	public void addEmployeeManager(EmployeeManagers employeeManager) {
		entityManager.unwrap(Session.class).saveOrUpdate(employeeManager);

		
	}

	@Override
	public void updateEmployeeManager(EmployeeManagers employeeManager) {
		entityManager.unwrap(Session.class).merge(employeeManager);

		
	}

	@Override
	public void deleteEmployeeManager(EmployeeManagers employeeManager) {
		entityManager.unwrap(Session.class).remove(employeeManager);

		
	}

	@Override
	public EmployeeManagers getEmployeeManagerById(int relationshipId) {
		return entityManager.unwrap(Session.class).get(EmployeeManagers.class,relationshipId);

	}

}
