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
import org.springframework.web.util.UriComponentsBuilder;

import com.project_hcms.entities.ApplicationStatus;
import com.project_hcms.services.ApplicationStatusService;



public class ApplicationStatusController {


	@Autowired
	ApplicationStatusService applicationStatus;
	
	@GetMapping("/applicationStatus")
	private ResponseEntity<List<ApplicationStatus>> getAll() {
		
		return new ResponseEntity<List<ApplicationStatus>>(applicationStatus.getAllApplicationStatus(), HttpStatus.OK);

	}
	
	@PostMapping("/applicationStatus")
	private ResponseEntity<Void> save(@RequestBody ApplicationStatus appStatus, UriComponentsBuilder ucBuilder) {
		if (appStatus == null) {
			throw new RuntimeException("ApplicationStatus Object can 't  be NULL");
		}
		applicationStatus.addApplicationStatus(appStatus);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/applicationStatus/{id}")
	private ResponseEntity<ApplicationStatus> get(@PathVariable int id) {
		ApplicationStatus appStatus = applicationStatus.getApplicationStatusById(id);
		if (appStatus == null) {
			return new ResponseEntity<ApplicationStatus>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<ApplicationStatus>(appStatus, HttpStatus.OK);
		}
	}
	@PutMapping("/applicationStatus/{id}")
	private ResponseEntity<Void> update(@RequestBody ApplicationStatus toBeUpdateApplicationStatus, @PathVariable int id) {
		if (toBeUpdateApplicationStatus == null) {
			throw new RuntimeException("ApplicationStatus Object can 't  be NULL");
		}
		ApplicationStatus existingApplicationStatus = applicationStatus.getApplicationStatusById(id);
		if(existingApplicationStatus == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			applicationStatus.updateApplicationStatus(existingApplicationStatus);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/applicationStatus/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		ApplicationStatus deleteApplicationStatus = applicationStatus.getApplicationStatusById(id);
		if (deleteApplicationStatus == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			applicationStatus.deleteApplicationStatus(deleteApplicationStatus);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
