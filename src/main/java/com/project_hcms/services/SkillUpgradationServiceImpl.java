package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.SkillUpgradationDAO;
import com.project_hcms.entities.SkillUpgradation;
@Service
public class SkillUpgradationServiceImpl implements SkillUpgradationService{
	@Autowired
	SkillUpgradationDAO skillUpgradationDAO;
	@Override
	public List<SkillUpgradation> getAllSkillUpgradation() {
		// TODO Auto-generated method stub
		return skillUpgradationDAO.getAllSkillUpgradation();
	}

	@Override
	public void addSkillUpgradation(SkillUpgradation skillUpgradation) {
		// TODO Auto-generated method stub
		skillUpgradationDAO.addSkillUpgradation(skillUpgradation);
		
	}

	@Override
	public void updateSkillUpgradation(SkillUpgradation skillUpgradation) {
		// TODO Auto-generated method stub
		skillUpgradationDAO.updateSkillUpgradation(skillUpgradation);
	}

	@Override
	public void deleteSkillUpgradation(SkillUpgradation skillUpgradation) {
		// TODO Auto-generated method stub
		skillUpgradationDAO.deleteSkillUpgradation(skillUpgradation);
	}

	@Override
	public SkillUpgradation getSkillUpgradationById(int upgradationId) {
		// TODO Auto-generated method stub
		return skillUpgradationDAO.getSkillUpgradationById(upgradationId);
	}

}
