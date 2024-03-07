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
	RoleServices role;
	
	@GetMapping("/roles")
	private ResponseEntity<List<Role>> getAll() {
		
		return new ResponseEntity<List<Role>>(role.getAllRole(), HttpStatus.OK);

	}
	
	@PostMapping("/roles")
	private ResponseEntity<Void> save(@RequestBody Role r, UriComponentsBuilder ucBuilder) {
		if (r == null) {
			throw new RuntimeException("Role Object can 't  be NULL");
		}
		role.addRole(r);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/roles/{id}")
	private ResponseEntity<Role> get(@PathVariable int id) {
		Role r = role.getRoleById(id);
		if (r == null) {
			return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Role>(r, HttpStatus.OK);
		}
	}
	@PutMapping("/roles/{id}")
	private ResponseEntity<Void> update(@RequestBody Role toBeUpdaterole, @PathVariable int id) {
		if (toBeUpdaterole == null) {
			throw new RuntimeException("Role Object can 't  be NULL");
		}
		Role existingrole = role.getRoleById(id);
		if(existingrole == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			role.updateRole(existingrole);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/roles/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Role deleteRole = role.getRoleById(id);
		if (deleteRole == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			role.deleteRole(deleteRole);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
