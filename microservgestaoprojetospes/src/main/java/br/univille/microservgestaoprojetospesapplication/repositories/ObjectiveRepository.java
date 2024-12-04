package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaoprojetospesapplication.entities.Objective;

@Repository
public interface ObjectiveRepository extends CrudRepository<Objective, String>
{

}