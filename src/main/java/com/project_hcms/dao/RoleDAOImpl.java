package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Employee;
import com.project_hcms.entities.Role;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RoleDAOImpl implements RoleDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Role> getAllRole() {
		
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Role", Role.class).getResultList();
	}

	@Override
	public void addRole(Role role) {
		entityManager.unwrap(Session.class).saveOrUpdate(role);
		
	}

	@Override
	public void updateRole(Role role) {
		entityManager.unwrap(Session.class).merge(role);
		
	}

	@Override
	public void deleteRole(Role role) {
		entityManager.unwrap(Session.class).remove(role);
		
	}

	@Override
	public Role getRoleById(int roleId) {
		return entityManager.unwrap(Session.class).get(Role.class,roleId);
	}

}
