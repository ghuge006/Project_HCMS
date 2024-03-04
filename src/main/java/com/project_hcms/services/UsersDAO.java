package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Users;

public interface UsersDAO {

	List<Users> getAllUsers();

	void addUsers(Users users);

	void updateUsers(Users users);

	void deleteUsers(int userId);
	
	Users getUsersById(int userId);
}
