package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.EducationalDetailsDAO;
import com.project_hcms.entities.EducationDetails;

@Service
public class EducationalDetailsServiceImpl implements EducationalDetailsService {

	@Autowired
	EducationalDetailsDAO educationalDetailsDAO;

	@Override
	public List<EducationDetails> getAllEducationDetails() {
		// TODO Auto-generated method stub
		return educationalDetailsDAO.getAllEducationDetails();
	}

	@Override
	public void addEducationDetails(EducationDetails educationDetails) {
		// TODO Auto-generated method stub
		educationalDetailsDAO.addEducationDetails(educationDetails);
	}

	@Override
	public void updateEducationDetails(EducationDetails educationDetails) {
		educationalDetailsDAO.updateEducationDetails(educationDetails);

	}

	@Override
	public void deleteEducationDetails(EducationDetails educationDetails) {
		educationalDetailsDAO.deleteEducationDetails(educationDetails);

	}

	@Override
	public EducationDetails getEducationDetailsById(int educationId) {
		// TODO Auto-generated method stub
		return educationalDetailsDAO.getEducationDetailsById(educationId);
	}

}
