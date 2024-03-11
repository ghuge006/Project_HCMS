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

import com.project_hcms.entities.LeaveRequests;
import com.project_hcms.services.LeaveRequestsService;


@RestController
public class LeaveRequestsController {

	@Autowired
	LeaveRequestsService leaveRequestsService;

	@GetMapping("/leaveRequests")
	private ResponseEntity<List<LeaveRequests>> getAll() {

		return new ResponseEntity<List<LeaveRequests>>(leaveRequestsService.getAllLeaveRequests(), HttpStatus.OK);

	}

	@PostMapping("/leaveRequests")
	private ResponseEntity<Void> save(@RequestBody LeaveRequests leaveRequests, UriComponentsBuilder ucBuilder) {
		if (leaveRequests == null) {
			throw new RuntimeException("LeaveRequests Object can 't  be NULL");
		}
		leaveRequestsService.addLeaveRequests(leaveRequests);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/leaveRequests/{id}")
	private ResponseEntity<LeaveRequests> get(@PathVariable int id) {
		LeaveRequests leaveRequests = leaveRequestsService.getLeaveRequestsById(id);
		if (leaveRequests == null) {
			return new ResponseEntity<LeaveRequests>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<LeaveRequests>(leaveRequests, HttpStatus.OK);
		}
	}

	@PutMapping("/leaveRequests/{id}")
	private ResponseEntity<Void> update(@RequestBody LeaveRequests toBeUpdateleaveRequests, @PathVariable int id) {
		if (toBeUpdateleaveRequests == null) {
			throw new RuntimeException("LeaveRequests Object can 't  be NULL");
		}
		LeaveRequests existingLeaveRequests = leaveRequestsService.getLeaveRequestsById(id);
		if (existingLeaveRequests == null) {

			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		} else {
			leaveRequestsService.updateLeaveRequests(existingLeaveRequests);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/leaveRequests/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		LeaveRequests deleteLeaveRequests = leaveRequestsService.getLeaveRequestsById(id);
		if (deleteLeaveRequests == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveRequestsService.deleteLeaveRequests(deleteLeaveRequests);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
