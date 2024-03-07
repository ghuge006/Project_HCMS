package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.TrainingModules;

public interface TrainingModulesService {

	List<TrainingModules> getAllTrainingModules();

	void addTrainingModules(TrainingModules trainingModules);

	void updateTrainingModules(TrainingModules trainingModules);

	void deleteTrainingModules(TrainingModules trainingModules);
	
	TrainingModules getTrainingModulesById(int moduleId);
}
