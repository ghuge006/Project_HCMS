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

import com.project_hcms.entities.Employee;
import com.project_hcms.services.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServices empService;

	@GetMapping("/employees")
	private ResponseEntity<List<Employee>> getAll() {
		return new ResponseEntity<List<Employee>>(empService.getAllEmployee(), HttpStatus.OK);

	}

	@PostMapping("/employees")
	private ResponseEntity<Void> save(@RequestBody Employee employee, UriComponentsBuilder ucBuilder) {
		if (employee == null) {
			throw new RuntimeException("Employee Object can 't  be NULL");
		}
		empService.addEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/employees/{id}")
	private ResponseEntity<Employee> get(@PathVariable int id) {
		Employee emp = empService.getEmployeeById(id);
		if (emp == null) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		}
	}

	@PutMapping("/employees/{id}")
	private ResponseEntity<Void> update(@RequestBody Employee toBeUpdateEmp, @PathVariable int id) {
		if (toBeUpdateEmp == null) {
			throw new RuntimeException("Employee Object can 't  be NULL");
		}
		Employee existingEmp = empService.getEmployeeById(id);
		if (existingEmp == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			empService.updateEmployee(toBeUpdateEmp);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/employees/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Employee deleteEmployee = empService.getEmployeeById(id);
		if (deleteEmployee == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			empService.deleteEmployee(deleteEmployee);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
