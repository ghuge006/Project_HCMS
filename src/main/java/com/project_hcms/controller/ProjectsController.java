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

import com.project_hcms.entities.Projects;
import com.project_hcms.services.ProjectsService;


@RestController
public class ProjectsController {

	@Autowired
	ProjectsService project;
	
	@GetMapping("/projects")
	private ResponseEntity<List<Projects>> getAll() {
		
		return new ResponseEntity<List<Projects>>(project.getAllProjects(), HttpStatus.OK);

	}
	
	@PostMapping("/projects")
	private ResponseEntity<Void> save(@RequestBody Projects pro, UriComponentsBuilder ucBuilder) {
		if (pro == null) {
			throw new RuntimeException("Projects Object can 't  be NULL");
		}
		project.addProjects(pro);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/projects/{id}")
	private ResponseEntity<Projects> get(@PathVariable int id) {
		Projects pro = project.getProjectsById(id);
		if (pro == null) {
			return new ResponseEntity<Projects>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Projects>(pro, HttpStatus.OK);
		}
	}
	@PutMapping("/projects/{id}")
	private ResponseEntity<Void> update(@RequestBody Projects toBeUpdateProjects, @PathVariable int id) {
		if (toBeUpdateProjects == null) {
			throw new RuntimeException("Projects Object can 't  be NULL");
		}
		Projects existingProjects = project.getProjectsById(id);
		if(existingProjects == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			project.updateProjects(existingProjects);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/projects/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Projects deleteProjects = project.getProjectsById(id);
		if (deleteProjects == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			project.deleteProjects(deleteProjects);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
