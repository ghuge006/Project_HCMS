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

import com.project_hcms.entities.EducationDetails;
import com.project_hcms.services.EducationalDetailsService;



@RestController
public class EducationDetailsController {

	@Autowired
	private EducationalDetailsService educationDetailsService;

	@GetMapping("/educationDetails")
	private ResponseEntity<List<EducationDetails>> getAll() {
		return new ResponseEntity<List<EducationDetails>>(educationDetailsService.getAllEducationDetails(), HttpStatus.OK);

	}

	@PostMapping("/educationDetails")
	private ResponseEntity<Void> save(@RequestBody EducationDetails educationDetails, UriComponentsBuilder ucBuilder) {
		if (educationDetails == null) {
			throw new RuntimeException("EducationDetails Object can 't  be NULL");
		}
		educationDetailsService.addEducationDetails(educationDetails);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/educationDetails/{id}")
	private ResponseEntity<EducationDetails> get(@PathVariable int id) {
		EducationDetails educationDetails = educationDetailsService.getEducationDetailsById(id);
		if (educationDetails == null) {
			return new ResponseEntity<EducationDetails>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<EducationDetails>(educationDetails, HttpStatus.OK);
		}
	}

	@PutMapping("/educationDetails/{id}")
	private ResponseEntity<Void> update(@RequestBody EducationDetails toBeUpdateEducationDetails, @PathVariable int id) {
		if (toBeUpdateEducationDetails == null) {
			throw new RuntimeException("EducationDetails Object can 't  be NULL");
		}
		EducationDetails existingEducationDetails = educationDetailsService.getEducationDetailsById(id);
		if (existingEducationDetails == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			educationDetailsService.updateEducationDetails(toBeUpdateEducationDetails);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/educationDetails/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		EducationDetails deleteEducationDetails = educationDetailsService.getEducationDetailsById(id);
		if (deleteEducationDetails == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			educationDetailsService.deleteEducationDetails(deleteEducationDetails);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
