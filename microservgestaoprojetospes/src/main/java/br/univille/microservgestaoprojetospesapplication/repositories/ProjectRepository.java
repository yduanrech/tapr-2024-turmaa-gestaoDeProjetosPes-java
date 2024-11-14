package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaoprojetospesapplication.entities.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, String>
{

}