package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface CauseRepository extends CrudRepository<Cause, String>
{

}