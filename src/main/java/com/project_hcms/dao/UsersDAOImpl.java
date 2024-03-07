package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Role;
import com.project_hcms.entities.Users;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Users> getAllUsers() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Users", Users.class).getResultList();
	
	}

	@Override
	public void addUsers(Users users) {
		entityManager.unwrap(Session.class).saveOrUpdate(users);
		
	}

	@Override
	public void updateUsers(Users users) {
		entityManager.unwrap(Session.class).merge(users);
		
	}

	@Override
	public void deleteUsers(Users users) {
		entityManager.unwrap(Session.class).remove(users);
		
	}

	@Override
	public Users getUsersById(int userId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Users.class,userId);
	}

}
