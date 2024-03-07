package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.SkillMatrix;

public interface SkillMatrixDAO {
	List<SkillMatrix> getAllSkillMatrix();

	void addSkillMatrix(SkillMatrix skillMatrix);

	void updateSkillMatrix(SkillMatrix skillMatrix);

	void deleteSkillMatrix(SkillMatrix skillMatrix);
	
	SkillMatrix getSkillMatrixById(int matrixId);
}
