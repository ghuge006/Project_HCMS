package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.SkillMatrix;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class SkillMatrixDAOImpl implements SkillMatrixDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<SkillMatrix> getAllSkillMatrix() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from SkillMatrix", SkillMatrix.class).getResultList();
	}

	@Override
	public void addSkillMatrix(SkillMatrix skillMatrix) {
		entityManager.unwrap(Session.class).saveOrUpdate(skillMatrix);
		
	}

	@Override
	public void updateSkillMatrix(SkillMatrix skillMatrix) {
		entityManager.unwrap(Session.class).merge(skillMatrix);
		
	}

	@Override
	public void deleteSkillMatrix(SkillMatrix skillMatrix) {
		entityManager.unwrap(Session.class).remove(skillMatrix);
		
	}

	@Override
	public SkillMatrix getSkillMatrixById(int matrixId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(SkillMatrix.class,matrixId);
	}

}
