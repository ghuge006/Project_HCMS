package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Certifications;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CertificationDAOImpl implements CertificationDAO{

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Certifications> getAllCertification() {
		Session session = entityManager.unwrap(Session.class);

		return session.createQuery("from Certifications", Certifications.class).getResultList();
	}

	@Override
	public void addCertification(Certifications certification) {
		entityManager.unwrap(Session.class).saveOrUpdate(certification);
		
	}

	@Override
	public void updateCertification(Certifications certification) {
		entityManager.unwrap(Session.class).merge(certification);
		
	}

	@Override
	public void deleteCertification(Certifications certification) {
		entityManager.unwrap(Session.class).remove(certification);
		
	}

	@Override
	public Certifications getCertificationById(int certificationId) {
		return entityManager.unwrap(Session.class).get(Certifications.class,certificationId);
	}

}
