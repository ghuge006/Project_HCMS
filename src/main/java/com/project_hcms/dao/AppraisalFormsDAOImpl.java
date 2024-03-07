package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.AppraisalForms;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class AppraisalFormsDAOImpl implements AppraisalFormsDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<AppraisalForms> getAllAppraisalForms() {
		Session session = entityManager.unwrap(Session.class);

		return session.createQuery("from AppraisalForms", AppraisalForms.class).getResultList();
	}

	@Override
	public void addAppraisalForms(AppraisalForms appraisalForms) {
		entityManager.unwrap(Session.class).saveOrUpdate(appraisalForms);
		
	}

	@Override
	public void updateAppraisalForms(AppraisalForms appraisalForms) {
		entityManager.unwrap(Session.class).merge(appraisalForms);
		
	}

	@Override
	public void deleteAppraisalForms(AppraisalForms appraisalForms) {
		entityManager.unwrap(Session.class).remove(appraisalForms);
		
	}

	@Override
	public AppraisalForms getAppraisalFormsById(int formId) {
		return entityManager.unwrap(Session.class).get(AppraisalForms.class,formId);
	}

}
