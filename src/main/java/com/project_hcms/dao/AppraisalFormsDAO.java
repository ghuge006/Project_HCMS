package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.AppraisalForms;

public interface AppraisalFormsDAO {
	List<AppraisalForms> getAllAppraisalForms();

	void addAppraisalForms(AppraisalForms appraisalForms);

	void updateAppraisalForms(AppraisalForms appraisalForms);

	void deleteAppraisalForms(AppraisalForms appraisalForms);
	
	AppraisalForms getAppraisalFormsById(int formId);
}
