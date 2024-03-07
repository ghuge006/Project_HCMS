package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.AppraisalFormsDAO;

import com.project_hcms.entities.AppraisalForms;
@Service
public class AppraisalFormsServiceImpl implements AppraisalFormsDAO {

	@Autowired
	AppraisalFormsDAO appraisalFormsDAO;

	@Override
	public List<AppraisalForms> getAllAppraisalForms() {
		// TODO Auto-generated method stub
		return appraisalFormsDAO.getAllAppraisalForms();
	}

	@Override
	public void addAppraisalForms(AppraisalForms appraisalForms) {
		appraisalFormsDAO.addAppraisalForms(appraisalForms);		
	}

	@Override
	public void updateAppraisalForms(AppraisalForms appraisalForms) {
		appraisalFormsDAO.updateAppraisalForms(appraisalForms);		
	}

	@Override
	public void deleteAppraisalForms(AppraisalForms appraisalForms) {
		appraisalFormsDAO.deleteAppraisalForms(appraisalForms);		
	}

	@Override
	public AppraisalForms getAppraisalFormsById(int formId) {
		// TODO Auto-generated method stub
		return appraisalFormsDAO.getAppraisalFormsById(formId);
	}
	

}
