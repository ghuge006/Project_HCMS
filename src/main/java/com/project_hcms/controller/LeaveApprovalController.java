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

import com.project_hcms.entities.LeaveApprovals;
import com.project_hcms.services.LeaveApprovalsService;



@RestController
public class LeaveApprovalController {

	@Autowired
	private LeaveApprovalsService leaveApprovalsService;

	@GetMapping("/leaveApprovals")
	private ResponseEntity<List<LeaveApprovals>> getAll() {
		return new ResponseEntity<List<LeaveApprovals>>(leaveApprovalsService.getAllLeaveApprovals(), HttpStatus.OK);

	}

	@PostMapping("/leaveApprovals")
	private ResponseEntity<Void> save(@RequestBody LeaveApprovals leaveApprovals, UriComponentsBuilder ucBuilder) {
		if (leaveApprovals == null) {
			throw new RuntimeException("leaveApprovals Object can 't  be NULL");
		}
		leaveApprovalsService.addLeaveApprovals(leaveApprovals);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("leaveApprovals/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/leaveApprovals/{id}")
	private ResponseEntity<LeaveApprovals> get(@PathVariable int id) {
		LeaveApprovals leaveApprovals = leaveApprovalsService.getLeaveApprovalsById(id);
		if (leaveApprovals == null) {
			return new ResponseEntity<LeaveApprovals>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<LeaveApprovals>(leaveApprovals, HttpStatus.OK);
		}
	}

	@PutMapping("/leaveApprovals/{id}")
	private ResponseEntity<Void> update(@RequestBody LeaveApprovals toBeUpdateleaveApprovals, @PathVariable int id) {
		if (toBeUpdateleaveApprovals == null) {
			throw new RuntimeException("LeaveApprovals Object can 't  be NULL");
		}
		LeaveApprovals existingleaveApprovals = leaveApprovalsService.getLeaveApprovalsById(id);
		if (existingleaveApprovals == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveApprovalsService.updateLeaveApprovals(toBeUpdateleaveApprovals);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/leaveApprovals/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		LeaveApprovals deleteLeaveApprovals = leaveApprovalsService.getLeaveApprovalsById(id);
		if (deleteLeaveApprovals == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveApprovalsService.deleteLeaveApprovals(deleteLeaveApprovals);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
