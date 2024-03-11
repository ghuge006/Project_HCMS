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

import com.project_hcms.entities.TrainingModules;
import com.project_hcms.services.TrainingModulesService;




@RestController
public class TrainingModulesController {

	@Autowired
	TrainingModulesService trainingModulesService;
	
	@GetMapping("/trainingModuless")
	private ResponseEntity<List<TrainingModules>> getAll() {
		
		return new ResponseEntity<List<TrainingModules>>(trainingModulesService.getAllTrainingModules(), HttpStatus.OK);

	}
	
	@PostMapping("/trainingModuless")
	private ResponseEntity<Void> save(@RequestBody TrainingModules trainingModules, UriComponentsBuilder ucBuilder) {
		if (trainingModules == null) {
			throw new RuntimeException("TrainingModules Object can 't  be NULL");
		}
		trainingModulesService.addTrainingModules(trainingModules);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/trainingModuless/{id}")
	private ResponseEntity<TrainingModules> get(@PathVariable int id) {
		TrainingModules trainingModules = trainingModulesService.getTrainingModulesById(id);
		if (trainingModules == null) {
			return new ResponseEntity<TrainingModules>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<TrainingModules>(trainingModules, HttpStatus.OK);
		}
	}
	@PutMapping("/trainingModuless/{id}")
	private ResponseEntity<Void> update(@RequestBody TrainingModules toBeUpdateTrainingModules, @PathVariable int id) {
		if (toBeUpdateTrainingModules == null) {
			throw new RuntimeException("TrainingModules Object can 't  be NULL");
		}
		TrainingModules existingTrainingModules = trainingModulesService.getTrainingModulesById(id);
		if(existingTrainingModules == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			trainingModulesService.updateTrainingModules(existingTrainingModules);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/trainingModuless/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		TrainingModules deleteTrainingModules = trainingModulesService.getTrainingModulesById(id);
		if (deleteTrainingModules == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingModulesService.deleteTrainingModules(deleteTrainingModules);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
