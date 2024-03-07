package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.CandidateProfiles;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CandidateProfileDAOImpl implements CandidateProfileDAO{

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<CandidateProfiles> getAllCandidateProfile() {
		Session session = entityManager.unwrap(Session.class);

		return session.createQuery("from CandidateProfiles", CandidateProfiles.class).getResultList();
	}

	@Override
	public void addCandidateProfile(CandidateProfiles candidateProfile) {
		entityManager.unwrap(Session.class).saveOrUpdate(candidateProfile);
		
	}

	@Override
	public void updateCandidateProfile(CandidateProfiles candidateProfile) {
		entityManager.unwrap(Session.class).merge(candidateProfile);
		
	}

	@Override
	public void deleteCandidateProfile(CandidateProfiles candidateProfile) {
		entityManager.unwrap(Session.class).remove(candidateProfile);
		
	}

	@Override
	public CandidateProfiles getCandidateProfileById(int candidateId) {
		return entityManager.unwrap(Session.class).get(CandidateProfiles.class,candidateId);
	}

}
