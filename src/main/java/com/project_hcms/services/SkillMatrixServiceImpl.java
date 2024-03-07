package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.SkillMatrixDAO;
import com.project_hcms.entities.SkillMatrix;
@Service
public class SkillMatrixServiceImpl implements SkillMatrixService{
	@Autowired
	SkillMatrixDAO skillMatrixDAO;
	@Override
	public List<SkillMatrix> getAllSkillMatrix() {
		// TODO Auto-generated method stub
		return skillMatrixDAO.getAllSkillMatrix();
	}

	@Override
	public void addSkillMatrix(SkillMatrix skillMatrix) {
		// TODO Auto-generated method stub
		skillMatrixDAO.addSkillMatrix(skillMatrix);
	}

	@Override
	public void updateSkillMatrix(SkillMatrix skillMatrix) {
		// TODO Auto-generated method stub
		skillMatrixDAO.updateSkillMatrix(skillMatrix);
		
	}

	@Override
	public void deleteSkillMatrix(SkillMatrix skillMatrix) {
		// TODO Auto-generated method stub
		skillMatrixDAO.deleteSkillMatrix(skillMatrix);
	}

	@Override
	public SkillMatrix getSkillMatrixById(int matrixId) {
		// TODO Auto-generated method stub
		return skillMatrixDAO.getSkillMatrixById(matrixId);
	}

}
