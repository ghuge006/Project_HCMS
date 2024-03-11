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

import com.project_hcms.entities.TrainingSchedules;
import com.project_hcms.services.TrainingSchedulesService;





@RestController
public class TrainingSchedulesController {

	@Autowired
	TrainingSchedulesService trainingSchedulesService;
	
	@GetMapping("/trainingScheduless")
	private ResponseEntity<List<TrainingSchedules>> getAll() {
		
		return new ResponseEntity<List<TrainingSchedules>>(trainingSchedulesService.getAllTrainingSchedules(), HttpStatus.OK);

	}
	
	@PostMapping("/trainingScheduless")
	private ResponseEntity<Void> save(@RequestBody TrainingSchedules trainingSchedules, UriComponentsBuilder ucBuilder) {
		if (trainingSchedules == null) {
			throw new RuntimeException("TrainingSchedules Object can 't  be NULL");
		}
		trainingSchedulesService.addTrainingSchedules(trainingSchedules);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/trainingScheduless/{id}")
	private ResponseEntity<TrainingSchedules> get(@PathVariable int id) {
		TrainingSchedules trainingSchedules = trainingSchedulesService.getTrainingSchedulesById(id);
		if (trainingSchedules == null) {
			return new ResponseEntity<TrainingSchedules>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<TrainingSchedules>(trainingSchedules, HttpStatus.OK);
		}
	}
	@PutMapping("/trainingScheduless/{id}")
	private ResponseEntity<Void> update(@RequestBody TrainingSchedules toBeUpdateTrainingSchedules, @PathVariable int id) {
		if (toBeUpdateTrainingSchedules == null) {
			throw new RuntimeException("TrainingSchedules Object can 't  be NULL");
		}
		TrainingSchedules existingTrainingSchedules = trainingSchedulesService.getTrainingSchedulesById(id);
		if(existingTrainingSchedules == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			trainingSchedulesService.updateTrainingSchedules(existingTrainingSchedules);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/trainingScheduless/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		TrainingSchedules deleteTrainingSchedules = trainingSchedulesService.getTrainingSchedulesById(id);
		if (deleteTrainingSchedules == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingSchedulesService.deleteTrainingSchedules(deleteTrainingSchedules);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
