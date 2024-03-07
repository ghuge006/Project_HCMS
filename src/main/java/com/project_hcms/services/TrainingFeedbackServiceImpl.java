package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.TrainingFeedbackDAO;
import com.project_hcms.entities.TrainingFeedback;
@Service
public class TrainingFeedbackServiceImpl implements TrainingFeedbackService {
	@Autowired
	TrainingFeedbackDAO trainingFeedbackDAO;
	@Override
	public List<TrainingFeedback> getAllTrainingFeedback() {
		// TODO Auto-generated method stub
		return trainingFeedbackDAO.getAllTrainingFeedback();
	}

	@Override
	public void addTrainingFeedback(TrainingFeedback trainingFeedback) {
		trainingFeedbackDAO.addTrainingFeedback(trainingFeedback);
		
	}

	@Override
	public void updateTrainingFeedback(TrainingFeedback trainingFeedback) {
		// TODO Auto-generated method stub
		trainingFeedbackDAO.updateTrainingFeedback(trainingFeedback);
	}

	@Override
	public void deleteTrainingFeedback(TrainingFeedback trainingFeedback) {
		// TODO Auto-generated method stub
		trainingFeedbackDAO.deleteTrainingFeedback(trainingFeedback);
	}

	@Override
	public TrainingFeedback getTrainingFeedbackById(int feedbackId) {
		// TODO Auto-generated method stub
		return trainingFeedbackDAO.getTrainingFeedbackById(feedbackId);
	}

}
