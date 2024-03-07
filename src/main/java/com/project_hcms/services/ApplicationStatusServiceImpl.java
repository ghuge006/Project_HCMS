package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.ApplicationStatusDAO;
import com.project_hcms.entities.ApplicationStatus;
@Service
public class ApplicationStatusServiceImpl implements ApplicationStatusService {

	@Autowired
	ApplicationStatusDAO applicationStatusDAO;
	@Override
	public List<ApplicationStatus> getAllApplicationStatus() {
		// TODO Auto-generated method stub
		return applicationStatusDAO.getAllApplicationStatus();
	}

	@Override
	public void addApplicationStatus(ApplicationStatus applicationStatus) {
		applicationStatusDAO.addApplicationStatus(applicationStatus);		
	}

	@Override
	public void updateApplicationStatus(ApplicationStatus applicationStatus) {
		applicationStatusDAO.updateApplicationStatus(applicationStatus);		
	}

	@Override
	public void deleteApplicationStatus(ApplicationStatus applicationId) {
		applicationStatusDAO.deleteApplicationStatus(applicationId);		
	}

	@Override
	public ApplicationStatus getApplicationStatusById(int applicationId) {
		// TODO Auto-generated method stub
		return applicationStatusDAO.getApplicationStatusById(applicationId);
	}

}
