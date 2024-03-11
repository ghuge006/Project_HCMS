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

import com.project_hcms.entities.EmployeeManagers;
import com.project_hcms.services.EmployeeManagersService;



@RestController
public class EmployeeManagersController {

	@Autowired
	private EmployeeManagersService empManagerService;

	@GetMapping("/employeeManagers")
	private ResponseEntity<List<EmployeeManagers>> getAll() {
		return new ResponseEntity<List<EmployeeManagers>>(empManagerService.getAllEmployeeManager(), HttpStatus.OK);

	}

	@PostMapping("/employeeManagers")
	private ResponseEntity<Void> save(@RequestBody EmployeeManagers employeeManagers, UriComponentsBuilder ucBuilder) {
		if (employeeManagers == null) {
			throw new RuntimeException("EmployeeManagers Object can 't  be NULL");
		}
		empManagerService.addEmployeeManager(employeeManagers);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/employeeManagers/{id}")
	private ResponseEntity<EmployeeManagers> get(@PathVariable int id) {
		EmployeeManagers employeeManagers = empManagerService.getEmployeeManagerById(id);
		if (employeeManagers == null) {
			return new ResponseEntity<EmployeeManagers>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<EmployeeManagers>(employeeManagers, HttpStatus.OK);
		}
	}

	@PutMapping("/employeeManagers/{id}")
	private ResponseEntity<Void> update(@RequestBody EmployeeManagers toBeUpdateEmployeeManagers, @PathVariable int id) {
		if (toBeUpdateEmployeeManagers == null) {
			throw new RuntimeException("EmployeeManagers Object can 't  be NULL");
		}
		EmployeeManagers existingEmployeeManagers = empManagerService.getEmployeeManagerById(id);
		if (existingEmployeeManagers == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			empManagerService.updateEmployeeManager(toBeUpdateEmployeeManagers);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/employeeManagers/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		EmployeeManagers deleteEmployeeManager = empManagerService.getEmployeeManagerById(id);
		if (deleteEmployeeManager == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			empManagerService.deleteEmployeeManager(deleteEmployeeManager);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
