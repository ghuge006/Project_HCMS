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

import com.project_hcms.entities.Users;
import com.project_hcms.services.UsersService;





@RestController
public class UsersController {

	@Autowired
	UsersService usersService;
	
	@GetMapping("/users")
	private ResponseEntity<List<Users>> getAll() {
		
		return new ResponseEntity<List<Users>>(usersService.getAllUsers(), HttpStatus.OK);

	}
	
	@PostMapping("/users")
	private ResponseEntity<Void> save(@RequestBody Users users, UriComponentsBuilder ucBuilder) {
		if (users == null) {
			throw new RuntimeException("Users Object can 't  be NULL");
		}
		usersService.addUsers(users);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/users/{id}")
	private ResponseEntity<Users> get(@PathVariable int id) {
		Users users = usersService.getUsersById(id);
		if (users == null) {
			return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Users>(users, HttpStatus.OK);
		}
	}
	@PutMapping("/users/{id}")
	private ResponseEntity<Void> update(@RequestBody Users toBeUpdateUsers, @PathVariable int id) {
		if (toBeUpdateUsers == null) {
			throw new RuntimeException("Users Object can 't  be NULL");
		}
		Users existingUsers = usersService.getUsersById(id);
		if(existingUsers == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			usersService.updateUsers(existingUsers);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/users/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Users deleteUsers = usersService.getUsersById(id);
		if (deleteUsers == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			usersService.deleteUsers(deleteUsers);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
