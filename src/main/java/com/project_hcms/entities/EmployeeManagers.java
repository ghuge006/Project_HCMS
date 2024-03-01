package com.project_hcms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name ="EmployeeManagers")
public class EmployeeManagers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RelationshipID")
	private int relationshipId;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "ManagerID")
	private Employee manager;

	@Column(name = "RelationshipType")
	private String relationshipType;

	// Getters and setters
	public EmployeeManagers() {
	}

	public EmployeeManagers(int relationshipId, Employee employee, Employee manager, String relationshipType) {
		this.relationshipId = relationshipId;
		this.employee = employee;
		this.manager = manager;
		this.relationshipType = relationshipType;
	}

	public int getRelationshipId() {
		return relationshipId;
	}

	public void setRelationshipId(int relationshipId) {
		this.relationshipId = relationshipId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	@Override
	public String toString() {
		return "EmployeeManagers [relationshipId=" + relationshipId + ", employee=" + employee + ", manager=" + manager
				+ ", relationshipType=" + relationshipType + "]";
	}

}
