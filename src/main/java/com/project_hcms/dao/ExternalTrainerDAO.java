package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.ExternalTrainers;

public interface ExternalTrainerDAO {
	List<ExternalTrainers> getAllExternalTrainer();

	void addExternalTrainer(ExternalTrainers externalTrainer);

	void updateExternalTrainer(ExternalTrainers externalTrainer);

	void deleteExternalTrainer(ExternalTrainers externalTrainer);
	
	ExternalTrainers getExternalTrainerById(int trainerId);
}
