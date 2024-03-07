package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.ExternalTrainers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ExternalTrainerDAOImpl implements ExternalTrainerDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<ExternalTrainers> getAllExternalTrainer() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from ExternalTrainers",ExternalTrainers.class).getResultList();
	}

	@Override
	public void addExternalTrainer(ExternalTrainers externalTrainer) {
		entityManager.unwrap(Session.class).saveOrUpdate(externalTrainer);		
	}

	@Override
	public void updateExternalTrainer(ExternalTrainers externalTrainer) {
		entityManager.unwrap(Session.class).merge(externalTrainer);
		
	}

	@Override
	public void deleteExternalTrainer(ExternalTrainers externalTrainer) {
		entityManager.unwrap(Session.class).remove(externalTrainer);
		
	}

	@Override
	public ExternalTrainers getExternalTrainerById(int trainerId) {
		return entityManager.unwrap(Session.class).get(ExternalTrainers.class,trainerId);
	}

}
