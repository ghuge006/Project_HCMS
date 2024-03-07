package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.ApplicationStatus;

public interface ApplicationStatusService {
	
	List<ApplicationStatus> getAllApplicationStatus();

	void addApplicationStatus(ApplicationStatus applicationStatus);

	void updateApplicationStatus(ApplicationStatus applicationStatus);

	void deleteApplicationStatus(ApplicationStatus applicationId);
	
	ApplicationStatus getApplicationStatusById(int applicationId);
}
