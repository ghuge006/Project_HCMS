package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Role;
import com.project_hcms.entities.Vacancies;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class VacanciesDAOImpl implements VacanciesDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Vacancies> getAllVacancies() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Vacancies", Vacancies.class).getResultList();
	
	}

	@Override
	public void addVacancies(Vacancies vacancies) {
		entityManager.unwrap(Session.class).saveOrUpdate(vacancies);
		
	}

	@Override
	public void updateVacancies(Vacancies vacancies) {
		entityManager.unwrap(Session.class).merge(vacancies);
		
	}

	@Override
	public void deleteVacancies(Vacancies vacancies) {
		entityManager.unwrap(Session.class).remove(vacancies);
		
	}

	@Override
	public Vacancies getVacanciesById(int vacancyId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Vacancies.class,vacancyId);
	}

}
