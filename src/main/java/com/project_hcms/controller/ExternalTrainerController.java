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

import com.project_hcms.entities.ExternalTrainers;
import com.project_hcms.services.ExternalTrainerService;

@RestController
public class ExternalTrainerController {

	@Autowired
	private ExternalTrainerService exTrainerService;

	@GetMapping("/externalTrainer")
	private ResponseEntity<List<ExternalTrainers>> getAll() {
		return new ResponseEntity<List<ExternalTrainers>>(exTrainerService.getAllExternalTrainer(), HttpStatus.OK);

	}

	@PostMapping("/externalTrainer")
	private ResponseEntity<Void> save(@RequestBody ExternalTrainers externalTrainer, UriComponentsBuilder ucBuilder) {
		if (externalTrainer == null) {
			throw new RuntimeException("ExternalTrainers Object can 't  be NULL");
		}
		exTrainerService.addExternalTrainer(externalTrainer);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("externalTrainer/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/externalTrainer/{id}")
	private ResponseEntity<ExternalTrainers> get(@PathVariable int id) {
		ExternalTrainers externalTrainer = exTrainerService.getExternalTrainerById(id);
		if (externalTrainer == null) {
			return new ResponseEntity<ExternalTrainers>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<ExternalTrainers>(externalTrainer, HttpStatus.OK);
		}
	}

	@PutMapping("/externalTrainer/{id}")
	private ResponseEntity<Void> update(@RequestBody ExternalTrainers toBeUpdateExternalTrainer, @PathVariable int id) {
		if (toBeUpdateExternalTrainer == null) {
			throw new RuntimeException("ExternalTrainers Object can 't  be NULL");
		}
		ExternalTrainers existingExternalTrainer = exTrainerService.getExternalTrainerById(id);
		if (existingExternalTrainer == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			exTrainerService.updateExternalTrainer(toBeUpdateExternalTrainer);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/externalTrainer/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		ExternalTrainers deleteExternalTrainers = exTrainerService.getExternalTrainerById(id);
		if (deleteExternalTrainers == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			exTrainerService.deleteExternalTrainer(deleteExternalTrainers);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
