package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.TrainingFeedback;

public interface TrainingFeedbackDAO {
	List<TrainingFeedback> getAllTrainingFeedback();

	void addTrainingFeedback(TrainingFeedback trainingFeedback);

	void updateTrainingFeedback(TrainingFeedback trainingFeedback);

	void deleteTrainingFeedback(int feedbackId);
	
	TrainingFeedback getTrainingFeedbackById(int feedbackId);
}
