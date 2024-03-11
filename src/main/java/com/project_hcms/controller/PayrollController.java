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

import com.project_hcms.entities.Payroll;
import com.project_hcms.services.PayrollService;





@RestController
public class PayrollController {

	@Autowired
	PayrollService payrollService;
	
	@GetMapping("/payrolls")
	private ResponseEntity<List<Payroll>> getAll() {
		
		return new ResponseEntity<List<Payroll>>(payrollService.getAllPayroll(), HttpStatus.OK);

	}
	
	@PostMapping("/payrolls")
	private ResponseEntity<Void> save(@RequestBody Payroll payroll, UriComponentsBuilder ucBuilder) {
		if (payroll == null) {
			throw new RuntimeException("Payroll Object can 't  be NULL");
		}
		payrollService.addPayroll(payroll);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("/payrolls/{id}")
	private ResponseEntity<Payroll> get(@PathVariable int id) {
		Payroll payroll = payrollService.getPayrollById(id);
		if (payroll == null) {
			return new ResponseEntity<Payroll>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Payroll>(payroll, HttpStatus.OK);
		}
	}
	@PutMapping("/payrolls/{id}")
	private ResponseEntity<Void> update(@RequestBody Payroll toBeUpdatePayroll, @PathVariable int id) {
		if (toBeUpdatePayroll == null) {
			throw new RuntimeException("Payroll Object can 't  be NULL");
		}
		Payroll existingPayroll = payrollService.getPayrollById(id);
		if(existingPayroll == null){
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		} else {
			payrollService.updatePayroll(existingPayroll);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/payrolls/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Payroll deletePayroll = payrollService.getPayrollById(id);
		if (deletePayroll == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			payrollService.deletePayroll(deletePayroll);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
