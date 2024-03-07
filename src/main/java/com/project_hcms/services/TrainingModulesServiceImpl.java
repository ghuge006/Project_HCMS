package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.TrainingModulesDAO;
import com.project_hcms.entities.TrainingModules;
@Service
public class TrainingModulesServiceImpl implements TrainingModulesService {
	@Autowired
	TrainingModulesDAO trainingModulesDAO;
	@Override
	public List<TrainingModules> getAllTrainingModules() {
		// TODO Auto-generated method stub
		return trainingModulesDAO.getAllTrainingModules();
	}

	@Override
	public void addTrainingModules(TrainingModules trainingModules) {
		// TODO Auto-generated method stub
		trainingModulesDAO.addTrainingModules(trainingModules);
	}

	@Override
	public void updateTrainingModules(TrainingModules trainingModules) {
		// TODO Auto-generated method stub
		trainingModulesDAO.updateTrainingModules(trainingModules);
	}

	@Override
	public void deleteTrainingModules(TrainingModules trainingModules) {
		// TODO Auto-generated method stub
		trainingModulesDAO.deleteTrainingModules(trainingModules);
	}

	@Override
	public TrainingModules getTrainingModulesById(int moduleId) {
		// TODO Auto-generated method stub
		return trainingModulesDAO.getTrainingModulesById(moduleId);
	}

}
