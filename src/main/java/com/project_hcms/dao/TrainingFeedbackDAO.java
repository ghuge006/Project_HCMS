package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.TrainingFeedback;

public interface TrainingFeedbackDAO {
	List<TrainingFeedback> getAllTrainingFeedback();

	void addTrainingFeedback(TrainingFeedback trainingFeedback);

	void updateTrainingFeedback(TrainingFeedback trainingFeedback);

	void deleteTrainingFeedback(TrainingFeedback trainingFeedback);
	
	TrainingFeedback getTrainingFeedbackById(int feedbackId);
}
