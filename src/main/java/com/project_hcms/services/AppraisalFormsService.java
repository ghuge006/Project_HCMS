package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.AppraisalForms;

public interface AppraisalFormsService {
	List<AppraisalForms> getAllAppraisalForms();

	void addAppraisalForms(AppraisalForms appraisalForms);

	void updateAppraisalForms(AppraisalForms appraisalForms);

	void deleteAppraisalForms(AppraisalForms appraisalForm);
	
	AppraisalForms getAppraisalFormsById(int formId);
}
