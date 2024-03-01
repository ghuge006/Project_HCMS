package com.project_hcms.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="AppraisalForms")
public class AppraisalForms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FormID")
	private int formId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employee employee;

	@Column(name = "SubmissionDate")
	private LocalDate submissionDate;

	// other fields...

	@ManyToOne
	@JoinColumn(name = "ReviewerID")
	private Employee reviewer;

	// Getters and setters
	public AppraisalForms() {
	}

	public AppraisalForms(int formId, Employee employee, LocalDate submissionDate, Employee reviewer) {
		this.formId = formId;
		this.employee = employee;
		this.submissionDate = submissionDate;
		this.reviewer = reviewer;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LocalDate getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDate submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Employee getReviewer() {
		return reviewer;
	}

	public void setReviewer(Employee reviewer) {
		this.reviewer = reviewer;
	}

	@Override
	public String toString() {
		return "AppraisalForms [formId=" + formId + ", employee=" + employee + ", submissionDate=" + submissionDate
				+ ", reviewer=" + reviewer + "]";
	}

}
