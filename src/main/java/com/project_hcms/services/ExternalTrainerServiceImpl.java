package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.ExternalTrainerDAO;
import com.project_hcms.entities.ExternalTrainers;
@Service
public class ExternalTrainerServiceImpl implements ExternalTrainerService {

	@Autowired
	ExternalTrainerDAO externaleTrainerDAO;
	@Override
	public List<ExternalTrainers> getAllExternalTrainer() {
		// TODO Auto-generated method stub
		return externaleTrainerDAO.getAllExternalTrainer();
	}

	@Override
	public void addExternalTrainer(ExternalTrainers externalTrainer) {
		// TODO Auto-generated method stub
		externaleTrainerDAO.addExternalTrainer(externalTrainer);
	}

	@Override
	public void updateExternalTrainer(ExternalTrainers externalTrainer) {
		// TODO Auto-generated method stub
		externaleTrainerDAO.updateExternalTrainer(externalTrainer);
	}

	@Override
	public void deleteExternalTrainer(ExternalTrainers externalTrainer) {
		// TODO Auto-generated method stub
		externaleTrainerDAO.deleteExternalTrainer(externalTrainer);
	}

	@Override
	public ExternalTrainers getExternalTrainerById(int trainerId) {
		// TODO Auto-generated method stub
		return externaleTrainerDAO.getExternalTrainerById(trainerId);
	}

}
