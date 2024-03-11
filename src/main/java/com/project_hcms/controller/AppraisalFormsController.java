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

import com.project_hcms.entities.AppraisalForms;

import com.project_hcms.services.AppraisalFormsService;

@RestController
public class AppraisalFormsController {

	@Autowired
	private AppraisalFormsService appraisalFormsService;

	@GetMapping("/appraisalForms")
	private ResponseEntity<List<AppraisalForms>> getAll() {
		return new ResponseEntity<List<AppraisalForms>>(appraisalFormsService.getAllAppraisalForms(), HttpStatus.OK);

	}

	@PostMapping("/appraisalForms")
	private ResponseEntity<Void> save(@RequestBody AppraisalForms appraisalForms, UriComponentsBuilder ucBuilder) {
		if (appraisalForms == null) {
			throw new RuntimeException("AppraisalForms Object can 't  be NULL");
		}
		appraisalFormsService.addAppraisalForms(appraisalForms);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/appraisalForms/{id}")
	private ResponseEntity<AppraisalForms> get(@PathVariable int id) {
		AppraisalForms appraisalForms = appraisalFormsService.getAppraisalFormsById(id);
		if (appraisalForms == null) {
			return new ResponseEntity<AppraisalForms>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<AppraisalForms>(appraisalForms, HttpStatus.OK);
		}
	}

	@PutMapping("/appraisalForms/{id}")
	private ResponseEntity<Void> update(@RequestBody AppraisalForms toBeUpdateAppraisalForms, @PathVariable int id) {
		if (toBeUpdateAppraisalForms == null) {
			throw new RuntimeException("AppraisalForms Object can 't  be NULL");
		}
		AppraisalForms existingAppraisalForms = appraisalFormsService.getAppraisalFormsById(id);
		if (existingAppraisalForms == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			appraisalFormsService.updateAppraisalForms(toBeUpdateAppraisalForms);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/appraisalForms/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		AppraisalForms deleteAppraisalForms = appraisalFormsService.getAppraisalFormsById(id);
		if (deleteAppraisalForms == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			appraisalFormsService.deleteAppraisalForms(deleteAppraisalForms);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
