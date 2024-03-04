package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.SkillUpgradation;

public interface SkillUpgradationDAO {
	List<SkillUpgradation> getAllSkillUpgradation();

	void addSkillUpgradation(SkillUpgradation skillUpgradation);

	void updateSkillUpgradation(SkillUpgradation skillUpgradation);

	void deleteSkillUpgradation(int upgradationId);
	
	SkillUpgradation getSkillUpgradationById(int upgradationId);
}
