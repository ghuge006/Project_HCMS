package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.EducationDetails;

public interface EducationalDetailsDAO {
	List<EducationDetails> getAllEducationDetails();

	void addEducationDetails(EducationDetails educationDetails);

	void updateEducationDetails(EducationDetails educationDetails);

	void deleteEducationDetails(int educationId);
	
	EducationDetails getEducationDetailsById(int educationId);
}
