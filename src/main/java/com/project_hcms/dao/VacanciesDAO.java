package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Vacancies;

public interface VacanciesDAO {

	List<Vacancies> getAllVacancies();

	void addVacancies(Vacancies vacancies);

	void updateVacancies(Vacancies vacancies);

	void deleteVacancies(Vacancies vacancies);
	
	Vacancies getVacanciesById(int vacancyId);
}
