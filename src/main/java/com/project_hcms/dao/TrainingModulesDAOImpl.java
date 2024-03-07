package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.TrainingModules;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class TrainingModulesDAOImpl implements TrainingModulesDAO{
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<TrainingModules> getAllTrainingModules() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from TrainingModules", TrainingModules.class).getResultList();
	
	}

	@Override
	public void addTrainingModules(TrainingModules trainingModules) {
		entityManager.unwrap(Session.class).saveOrUpdate(trainingModules);
		
	}

	@Override
	public void updateTrainingModules(TrainingModules trainingModules) {
		entityManager.unwrap(Session.class).merge(trainingModules);
		
	}

	@Override
	public void deleteTrainingModules(TrainingModules trainingModules) {
		entityManager.unwrap(Session.class).remove(trainingModules);
		
	}

	@Override
	public TrainingModules getTrainingModulesById(int moduleId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(TrainingModules.class,moduleId);
	}

}
