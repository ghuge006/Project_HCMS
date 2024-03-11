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

import com.project_hcms.entities.Certifications;
import com.project_hcms.services.CertificationService;

@RestController
public class CertificationsController {

	@Autowired
	private CertificationService certificationsService;

	@GetMapping("/certifications")
	private ResponseEntity<List<Certifications>> getAll() {
		return new ResponseEntity<List<Certifications>>(certificationsService.getAllCertification(), HttpStatus.OK);

	}

	@PostMapping("/certifications")
	private ResponseEntity<Void> save(@RequestBody Certifications certifications, UriComponentsBuilder ucBuilder) {
		if (certifications == null) {
			throw new RuntimeException("Certifications Object can 't  be NULL");
		}
		certificationsService.addCertification(certifications);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/certifications/{id}")
	private ResponseEntity<Certifications> get(@PathVariable int id) {
		Certifications certifications = certificationsService.getCertificationById(id);
		if (certifications == null) {
			return new ResponseEntity<Certifications>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Certifications>(certifications, HttpStatus.OK);
		}
	}

	@PutMapping("/certifications/{id}")
	private ResponseEntity<Void> update(@RequestBody Certifications toBeUpdateCertifications, @PathVariable int id) {
		if (toBeUpdateCertifications == null) {
			throw new RuntimeException("Certifications Object can 't  be NULL");
		}
		Certifications existingCertifications = certificationsService.getCertificationById(id);
		if (existingCertifications == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			certificationsService.updateCertification(toBeUpdateCertifications);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/certifications/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Certifications deleteCertifications = certificationsService.getCertificationById(id);
		if (deleteCertifications == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			certificationsService.deleteCertification(deleteCertifications);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}