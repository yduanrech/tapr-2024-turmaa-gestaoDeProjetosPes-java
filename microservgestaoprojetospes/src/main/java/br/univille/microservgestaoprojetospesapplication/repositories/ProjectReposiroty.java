package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, String>
{

}