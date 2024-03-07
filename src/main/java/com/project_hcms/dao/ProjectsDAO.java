package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Projects;

public interface ProjectsDAO {
	List<Projects> getAllProjects();

	void addProjects(Projects projects);

	void updateProjects(Projects projects);

	void deleteProjects(Projects projects);
	
	Projects getProjectsById(int projectId);
}
