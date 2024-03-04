package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Role;

public interface RoleServices {
	List<Role> getAllRole();

	void addRole(Role role);

	void updateRole(Role role);

	void deleteRole(int roleId);
	
	Role getRoleById(int roleId);
}
