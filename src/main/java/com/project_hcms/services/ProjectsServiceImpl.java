package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.ProjectsDAO;
import com.project_hcms.entities.Projects;
@Service
public class ProjectsServiceImpl implements ProjectsService {
	@Autowired
	ProjectsDAO projectsDAO;
	@Override
	public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		return projectsDAO.getAllProjects();
	}

	@Override
	public void addProjects(Projects projects) {
		// TODO Auto-generated method stub
		projectsDAO.addProjects(projects);
	}

	@Override
	public void updateProjects(Projects projects) {
		// TODO Auto-generated method stub
		projectsDAO.updateProjects(projects);
	}

	@Override
	public void deleteProjects(Projects projects) {
		// TODO Auto-generated method stub
		projectsDAO.deleteProjects(projects);
	}

	@Override
	public Projects getProjectsById(int projectId) {
		// TODO Auto-generated method stub
		return projectsDAO.getProjectsById(projectId);
	}

}
