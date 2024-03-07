package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Projects;

public interface ProjectsService {
	List<Projects> getAllProjects();

	void addProjects(Projects projects);

	void updateProjects(Projects projects);

	void deleteProjects(Projects projects);
	
	Projects getProjectsById(int projectId);
}
