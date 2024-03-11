package com.project_hcms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.project_hcms.entities.Role;
import com.project_hcms.services.RoleServices;



@RestController
public class RoleController {

	@Autowired
	RoleServices roleService;
	
	@GetMapping("/roles")
	private ResponseEntity<List<Role>> getAll() {
		
		return new ResponseEntity<List<Role>>(roleService.getAllRole(), HttpStatus.OK);

	}
	
	@PostMapping("/roles")
	private ResponseEntity<Void> save(@RequestBody Role role, UriComponentsBuilder ucBuilder) {
		if (role == null) {
			throw new RuntimeException("Role Object can 't  be NULL");
		}
		roleService.addRole(role);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/roles/{id}")
	private ResponseEntity<Role> get(@PathVariable int id) {
		Role role = roleService.getRoleById(id);
		if (role == null) {
			return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Role>(role, HttpStatus.OK);
		}
	}
	@PutMapping("/roles/{id}")
	private ResponseEntity<Void> update(@RequestBody Role toBeUpdateRole, @PathVariable int id) {
		if (toBeUpdateRole == null) {
			throw new RuntimeException("Role Object can 't  be NULL");
		}
		Role existingRole = roleService.getRoleById(id);
		if(existingRole == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			roleService.updateRole(existingRole);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/roles/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Role deleteRole = roleService.getRoleById(id);
		if (deleteRole == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			roleService.deleteRole(deleteRole);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
