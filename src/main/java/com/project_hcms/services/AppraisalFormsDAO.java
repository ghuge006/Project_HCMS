package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.AppraisalForms;

public interface AppraisalFormsDAO {
	List<AppraisalForms> getAllAppraisalForms();

	void addAppraisalForms(AppraisalForms appraisalForms);

	void updateAppraisalForms(AppraisalForms appraisalForms);

	void deleteAppraisalForms(int formId);
	
	AppraisalForms getAppraisalFormsById(int formId);
}
