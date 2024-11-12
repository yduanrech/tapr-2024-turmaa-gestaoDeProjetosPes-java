package br.univille.microservgestaoprojetospesapplication.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.repositories.ProjectRepository;
import br.univille.microservgestaoprojetospesapplication.services.ProjectSrvices;

@Service
public class ProjectServiceImpl implements ProjectServices
{
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAll()
    {
        var returnIterator = projectRepository.findAll();
        var listProjects = new ArrayList<Project>();
        returnIterator.forEach(listProjects::add);
        return listProjects;
    }

    @Override
    public Project createNewProject(Team team, Objective objective, Problem problem) {
        Project newProject = new Project();
        newProject.setTeam(team);
        newProject.setObjective(objective);
        newProject.setProblem(problem);
        return projectRepository.save(newProject);
    }

    // @Override
    // public Project save(Project project)
    // {
    //     return projectRepository.save(project);
    // }

    // @Override
    // public Project getByCd(String cdProject)
    // {
    //     var project = projectRepository.findById(cdProject);
    //     if(project.isPresent()) return project.get();
    //     return null;
    // }

    // @Override
    // public Project update(String cdProject, Project Project)
    // {
    //     var searchOldProject = projectRepository.findById(cdProject);
    //     if (searchOldProject.isPresent()) {
    //         var oldProject = searchOldProject.get();

    //         oldProject.setNome(project.getNome());
    //         oldProject.setEndereco(project.getEndereco());

    //         return repository.save(oldProject);
    //     }

    //     return null;
    // }

}