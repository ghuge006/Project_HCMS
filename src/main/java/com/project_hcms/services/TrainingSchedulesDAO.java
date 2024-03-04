package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.TrainingSchedules;

public interface TrainingSchedulesDAO {

	List<TrainingSchedules> getAllTrainingSchedules();

	void addTrainingSchedules(TrainingSchedules trainingSchedules);

	void updateTrainingSchedules(TrainingSchedules trainingSchedules);

	void deleteTrainingSchedules(int scheduleId);
	
	TrainingSchedules getTrainingSchedulesById(int scheduleId);
}
