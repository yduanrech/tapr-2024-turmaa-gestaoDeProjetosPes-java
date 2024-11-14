package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaoprojetospesapplication.entities.Cause;

@Repository
public interface CauseRepository extends CrudRepository<Cause, String>
{

}