package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Vacancies;

public interface VacanciesDAO {

	List<Vacancies> getAllVacancies();

	void addVacancies(Vacancies vacancies);

	void updateVacancies(Vacancies vacancies);

	void deleteVacancies(int vacancyId);
	
	Vacancies getVacanciesById(int vacancyId);
}
