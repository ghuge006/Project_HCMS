package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.EducationDetails;

public interface EducationalDetailsService {
	List<EducationDetails> getAllEducationDetails();

	void addEducationDetails(EducationDetails educationDetails);

	void updateEducationDetails(EducationDetails educationDetails);

	void deleteEducationDetails(EducationDetails educationDetails);
	
	EducationDetails getEducationDetailsById(int educationId);
}
