package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.SkillUpgradation;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class SkillUpgradationDAOImpl implements SkillUpgradationDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<SkillUpgradation> getAllSkillUpgradation() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from SkillUpgradation", SkillUpgradation.class).getResultList();
	}

	@Override
	public void addSkillUpgradation(SkillUpgradation skillUpgradation) {
		entityManager.unwrap(Session.class).saveOrUpdate(skillUpgradation);
		
	}

	@Override
	public void updateSkillUpgradation(SkillUpgradation skillUpgradation) {
		entityManager.unwrap(Session.class).merge(skillUpgradation);
		
	}

	@Override
	public void deleteSkillUpgradation(SkillUpgradation skillUpgradation) {
		entityManager.unwrap(Session.class).remove(skillUpgradation);
		
	}

	@Override
	public SkillUpgradation getSkillUpgradationById(int upgradationId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(SkillUpgradation.class,upgradationId);
	}

}
