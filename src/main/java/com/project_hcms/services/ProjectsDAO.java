package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Projects;

public interface ProjectsDAO {
	List<Projects> getAllProjects();

	void addProjects(Projects projects);

	void updateProjects(Projects projects);

	void deleteProjects(int projectId);
	
	Projects getProjectsById(int projectId);
}
