package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;
import br.univille.microservgestaoprojetospesapplication.entities.Project;

public interface ProjectService
{
    List<Project> getAll();
    Project save(Project project);
    Project update(String cdProject, Project project);
    Project delete(String cdProject);
}