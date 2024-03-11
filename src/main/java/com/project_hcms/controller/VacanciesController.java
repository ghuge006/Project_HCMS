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


import com.project_hcms.entities.Vacancies;

import com.project_hcms.services.VacanciesService;



@RestController
public class VacanciesController {

	@Autowired
	VacanciesService vacanciesService;
	
	@GetMapping("/vacancies")
	private ResponseEntity<List<Vacancies>> getAll() {
		
		return new ResponseEntity<List<Vacancies>>(vacanciesService.getAllVacancies(), HttpStatus.OK);

	}
	
	@PostMapping("/vacancies")
	private ResponseEntity<Void> save(@RequestBody Vacancies vacancies, UriComponentsBuilder ucBuilder) {
		if (vacancies == null) {
			throw new RuntimeException("Vacancies Object can 't  be NULL");
		}
		vacanciesService.addVacancies(vacancies);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/vacancies/{id}")
	private ResponseEntity<Vacancies> get(@PathVariable int id) {
		Vacancies vacancies = vacanciesService.getVacanciesById(id);
		if (vacancies == null) {
			return new ResponseEntity<Vacancies>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Vacancies>(vacancies, HttpStatus.OK);
		}
	}
	@PutMapping("/vacancies/{id}")
	private ResponseEntity<Void> update(@RequestBody Vacancies toBeUpdateVacancies, @PathVariable int id) {
		if (toBeUpdateVacancies == null) {
			throw new RuntimeException("Vacancies Object can 't  be NULL");
		}
		Vacancies existingVacancies = vacanciesService.getVacanciesById(id);
		if(existingVacancies == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			vacanciesService.updateVacancies(existingVacancies);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/vacancies/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Vacancies deleteVacancies = vacanciesService.getVacanciesById(id);
		if (deleteVacancies == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			vacanciesService.deleteVacancies(deleteVacancies);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
