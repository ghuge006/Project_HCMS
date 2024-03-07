package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.VacanciesDAO;
import com.project_hcms.entities.Vacancies;
@Service
public class VacanciesServiceImpl implements VacanciesService {
	@Autowired
	VacanciesDAO vacanciesDAO;
	@Override
	public List<Vacancies> getAllVacancies() {
		// TODO Auto-generated method stub
		return vacanciesDAO.getAllVacancies();
	}

	@Override
	public void addVacancies(Vacancies vacancies) {
		// TODO Auto-generated method stub
		vacanciesDAO.addVacancies(vacancies);
	}

	@Override
	public void updateVacancies(Vacancies vacancies) {
		// TODO Auto-generated method stub
		vacanciesDAO.updateVacancies(vacancies);
	}

	@Override
	public void deleteVacancies(Vacancies vacancies) {
		// TODO Auto-generated method stub
		vacanciesDAO.deleteVacancies(vacancies);
	}

	@Override
	public Vacancies getVacanciesById(int vacancyId) {
		// TODO Auto-generated method stub
		return vacanciesDAO.getVacanciesById(vacancyId);
	}

}
