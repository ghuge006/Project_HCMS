package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.TrainingSchedules;

public interface TrainingSchedulesDAO {

	List<TrainingSchedules> getAllTrainingSchedules();

	void addTrainingSchedules(TrainingSchedules trainingSchedules);

	void updateTrainingSchedules(TrainingSchedules trainingSchedules);

	void deleteTrainingSchedules(TrainingSchedules trainingSchedules);
	
	TrainingSchedules getTrainingSchedulesById(int scheduleId);
}
