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

import com.project_hcms.entities.CandidateProfiles;
import com.project_hcms.services.CandidateProfileService;



@RestController
public class CandidateProfilesController {

	@Autowired
	private CandidateProfileService candidateProfilesService;

	@GetMapping("/candidateProfiles")
	private ResponseEntity<List<CandidateProfiles>> getAll() {
		return new ResponseEntity<List<CandidateProfiles>>(candidateProfilesService.getAllCandidateProfile(), HttpStatus.OK);

	}

	@PostMapping("/candidateProfiles")
	private ResponseEntity<Void> save(@RequestBody CandidateProfiles candidateProfiles, UriComponentsBuilder ucBuilder) {
		if (candidateProfiles == null) {
			throw new RuntimeException("CandidateProfiles Object can 't  be NULL");
		}
		candidateProfilesService.addCandidateProfile(candidateProfiles);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/candidateProfiles/{id}")
	private ResponseEntity<CandidateProfiles> get(@PathVariable int id) {
		CandidateProfiles candidateProfiles = candidateProfilesService.getCandidateProfileById(id);
		if (candidateProfiles == null) {
			return new ResponseEntity<CandidateProfiles>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<CandidateProfiles>(candidateProfiles, HttpStatus.OK);
		}
	}

	@PutMapping("/candidateProfiles/{id}")
	private ResponseEntity<Void> update(@RequestBody CandidateProfiles toBeUpdateCandidateProfiles, @PathVariable int id) {
		if (toBeUpdateCandidateProfiles == null) {
			throw new RuntimeException("CandidateProfiles Object can 't  be NULL");
		}
		CandidateProfiles existingCandidateProfiles = candidateProfilesService.getCandidateProfileById(id);
		if (existingCandidateProfiles == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			candidateProfilesService.updateCandidateProfile(toBeUpdateCandidateProfiles);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/candidateProfiles/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		CandidateProfiles deleteCandidateProfiles = candidateProfilesService.getCandidateProfileById(id);
		if (deleteCandidateProfiles == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			candidateProfilesService.deleteCandidateProfile(deleteCandidateProfiles);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
