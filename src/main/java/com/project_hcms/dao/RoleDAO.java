package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Role;

public interface RoleDAO {

	List<Role> getAllRole();

	void addRole(Role role);

	void updateRole(Role role);

	void deleteRole(Role role);
	
	Role getRoleById(int roleId);
}
