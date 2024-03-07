package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.SkillMatrix;

public interface SkillMatrixService {
	List<SkillMatrix> getAllSkillMatrix();

	void addSkillMatrix(SkillMatrix skillMatrix);

	void updateSkillMatrix(SkillMatrix skillMatrix);

	void deleteSkillMatrix(SkillMatrix skillMatrix);
	
	SkillMatrix getSkillMatrixById(int matrixId);
}
