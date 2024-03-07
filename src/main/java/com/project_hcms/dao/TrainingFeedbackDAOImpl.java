package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.TrainingFeedback;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class TrainingFeedbackDAOImpl implements TrainingFeedbackDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<TrainingFeedback> getAllTrainingFeedback() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from TrainingFeedback", TrainingFeedback.class).getResultList();
	
	}

	@Override
	public void addTrainingFeedback(TrainingFeedback trainingFeedback) {
		entityManager.unwrap(Session.class).saveOrUpdate(trainingFeedback);
		
	}

	@Override
	public void updateTrainingFeedback(TrainingFeedback trainingFeedback) {
		entityManager.unwrap(Session.class).merge(trainingFeedback);
		
	}

	@Override
	public void deleteTrainingFeedback(TrainingFeedback trainingFeedback) {
		entityManager.unwrap(Session.class).remove(trainingFeedback);
		
	}

	@Override
	public TrainingFeedback getTrainingFeedbackById(int feedbackId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(TrainingFeedback.class,feedbackId);
	}

}
