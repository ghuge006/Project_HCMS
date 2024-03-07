package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Projects;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ProjectsDAOImpl implements ProjectsDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Projects> getAllProjects() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Projects", Projects.class).getResultList();
	}

	@Override
	public void addProjects(Projects projects) {
		entityManager.unwrap(Session.class).saveOrUpdate(projects);
		
	}

	@Override
	public void updateProjects(Projects projects) {
		entityManager.unwrap(Session.class).merge(projects);
		
	}

	@Override
	public void deleteProjects(Projects projects) {
		entityManager.unwrap(Session.class).remove(projects);
		
	}

	@Override
	public Projects getProjectsById(int projectId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Projects.class,projectId);
	}

}
