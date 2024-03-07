package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.EducationDetails;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EducationalDetailsDAOImpl implements EducationalDetailsDAO {

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<EducationDetails> getAllEducationDetails() {
		Session session = entityManager.unwrap(Session.class);

		return session.createQuery("from EducationDetails", EducationDetails.class).getResultList();
	}

	@Override
	public void addEducationDetails(EducationDetails educationDetails) {
		entityManager.unwrap(Session.class).saveOrUpdate(educationDetails);		
	}

	@Override
	public void updateEducationDetails(EducationDetails educationDetails) {
		entityManager.unwrap(Session.class).merge(educationDetails);		
	}

	@Override
	public void deleteEducationDetails(EducationDetails educationDetails) {
		entityManager.unwrap(Session.class).remove(educationDetails);		
	}

	@Override
	public EducationDetails getEducationDetailsById(int educationId) {
		return entityManager.unwrap(Session.class).get(EducationDetails.class,educationId);
	}

}
