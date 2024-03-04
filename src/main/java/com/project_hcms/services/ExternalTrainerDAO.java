package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.ExternalTrainers;

public interface ExternalTrainerDAO {
	List<ExternalTrainers> getAllExternalTrainer();

	void addExternalTrainer(ExternalTrainers externalTrainer);

	void updateExternalTrainer(ExternalTrainers externalTrainer);

	void deleteExternalTrainer(int trainerId);
	
	ExternalTrainers getExternalTrainerById(int trainerId);
}
