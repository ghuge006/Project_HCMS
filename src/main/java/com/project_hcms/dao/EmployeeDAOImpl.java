package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Employee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> getAllEmployee() {

		Session session = entityManager.unwrap(Session.class);

		return session.createQuery("from Employees", Employee.class).getResultList();
	}

	@Override
	public void addEmployee(Employee emp) {
		
		entityManager.unwrap(Session.class).saveOrUpdate(emp);

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
