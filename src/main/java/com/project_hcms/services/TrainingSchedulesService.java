package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.TrainingSchedules;

public interface TrainingSchedulesService {

	List<TrainingSchedules> getAllTrainingSchedules();

	void addTrainingSchedules(TrainingSchedules trainingSchedules);

	void updateTrainingSchedules(TrainingSchedules trainingSchedules);

	void deleteTrainingSchedules(TrainingSchedules trainingSchedules);
	
	TrainingSchedules getTrainingSchedulesById(int scheduleId);
}
