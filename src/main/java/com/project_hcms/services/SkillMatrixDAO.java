package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.SkillMatrix;

public interface SkillMatrixDAO {
	List<SkillMatrix> getAllSkillMatrix();

	void addSkillMatrix(SkillMatrix skillMatrix);

	void updateSkillMatrix(SkillMatrix skillMatrix);

	void deleteSkillMatrix(int matrixId);
	
	SkillMatrix getSkillMatrixById(int matrixId);
}
