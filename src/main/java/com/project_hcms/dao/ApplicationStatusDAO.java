package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.ApplicationStatus;

public interface ApplicationStatusDAO {
	List<ApplicationStatus> getAllApplicationStatus();

	void addApplicationStatus(ApplicationStatus applicationStatus);

	void updateApplicationStatus(ApplicationStatus applicationStatus);

	void deleteApplicationStatus(ApplicationStatus applicationStatus);
	
	ApplicationStatus getApplicationStatusById(int applicationId);
}
