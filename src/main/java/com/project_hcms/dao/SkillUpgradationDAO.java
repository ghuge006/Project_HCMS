package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.SkillUpgradation;

public interface SkillUpgradationDAO {
	List<SkillUpgradation> getAllSkillUpgradation();

	void addSkillUpgradation(SkillUpgradation skillUpgradation);

	void updateSkillUpgradation(SkillUpgradation skillUpgradation);

	void deleteSkillUpgradation(SkillUpgradation skillUpgradation);
	
	SkillUpgradation getSkillUpgradationById(int upgradationId);
}
