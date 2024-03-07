package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.TrainingSchedulesDAO;
import com.project_hcms.entities.TrainingSchedules;
@Service
public class TrainingSchedulesServiceImpl implements TrainingSchedulesService{
	@Autowired
	TrainingSchedulesDAO trainingSchedulesDAO;
	@Override
	public List<TrainingSchedules> getAllTrainingSchedules() {
		// TODO Auto-generated method stub
		return trainingSchedulesDAO.getAllTrainingSchedules();
	}

	@Override
	public void addTrainingSchedules(TrainingSchedules trainingSchedules) {
		// TODO Auto-generated method stub
		trainingSchedulesDAO.addTrainingSchedules(trainingSchedules);
	}

	@Override
	public void updateTrainingSchedules(TrainingSchedules trainingSchedules) {
		// TODO Auto-generated method stub
		trainingSchedulesDAO.updateTrainingSchedules(trainingSchedules);
	}

	@Override
	public void deleteTrainingSchedules(TrainingSchedules trainingSchedules) {
		// TODO Auto-generated method stub
		trainingSchedulesDAO.deleteTrainingSchedules(trainingSchedules);
	}

	@Override
	public TrainingSchedules getTrainingSchedulesById(int SchedulesId) {
		// TODO Auto-generated method stub
		return trainingSchedulesDAO.getTrainingSchedulesById(SchedulesId);
	}

}
