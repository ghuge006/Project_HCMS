package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.RoleDAO;
import com.project_hcms.entities.Role;
@Service
public class RoleServicesImpl implements RoleServices {

	@Autowired
	RoleDAO roleDAO;
	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return roleDAO.getAllRole();
	}

	@Override
	public void addRole(Role role) {
		roleDAO.addRole(role);
		
	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRole(int roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role getRoleById(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
