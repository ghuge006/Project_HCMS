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

import com.project_hcms.entities.Department;

import com.project_hcms.services.DepartmentServices;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentServices deptService;
	
	@GetMapping("/departments")
	private ResponseEntity<List<Department>> getAll() {
		return new ResponseEntity<List<Department>>(deptService.getAllDepartment(), HttpStatus.OK);

	}
	
	@PostMapping("/departments")
	private ResponseEntity<Void> save(@RequestBody Department dept, UriComponentsBuilder ucBuilder) {
		if (dept == null) {
			throw new RuntimeException("Department Object can 't  be NULL");
		}
		deptService.addDepartment(dept);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/departments/{id}")
	private ResponseEntity<Department> get(@PathVariable int id) {
		Department dept = deptService.getDepartmentById(id);
		if (dept == null) {
			return new ResponseEntity<Department>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Department>(dept, HttpStatus.OK);
		}
	}
	@PutMapping("/departments/{id}")
	private ResponseEntity<Void> update(@RequestBody Department toBeUpdateDept, @PathVariable int id) {
		if (toBeUpdateDept == null) {
			throw new RuntimeException("Department Object can 't  be NULL");
		}
		Department existingDept = deptService.getDepartmentById(id);
		if (existingDept == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			deptService.updateDepartment(existingDept);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/departments/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Department deleteDept = deptService.getDepartmentById(id);
		if (deleteDept == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			deptService.deleteDepartment(deleteDept);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
