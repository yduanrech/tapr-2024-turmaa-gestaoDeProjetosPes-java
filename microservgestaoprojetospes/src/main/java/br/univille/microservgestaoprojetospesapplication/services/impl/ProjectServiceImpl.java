package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl extends GenericServiceImpl<Project, ProjectRepository>
{
    ProjectRepository projectRepository;
    
    @Override
    public Project update(String cdProject, Project project)
    {
        var getProject = projectRepository.findById(cdProject);

        if(!getProject.isPresent()) {
            throw new RuntimeException("Project not found with id: " + cdProject);
        }

        var oldProject = getProject.get();

        oldProject.setProjectTitle(project.getProjectTitle());
        projectRepository.save(oldProject);
        return oldProject;
    }

}