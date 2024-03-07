package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.UsersDAO;
import com.project_hcms.entities.Users;
@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	UsersDAO userDAO;
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.getAllUsers();
	}

	@Override
	public void addUsers(Users users) {
		// TODO Auto-generated method stub
		userDAO.addUsers(users);
	}

	@Override
	public void updateUsers(Users users) {
		// TODO Auto-generated method stub
		userDAO.updateUsers(users);
	}

	@Override
	public void deleteUsers(Users users) {
		// TODO Auto-generated method stub
		userDAO.deleteUsers(users);
	}

	@Override
	public Users getUsersById(int userId) {
		// TODO Auto-generated method stub
		return userDAO.getUsersById(userId);
	}

}
