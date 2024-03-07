package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Users;

public interface UsersDAO {

	List<Users> getAllUsers();

	void addUsers(Users users);

	void updateUsers(Users users);

	void deleteUsers(Users users);
	
	Users getUsersById(int userId);
}
