package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaoprojetospesapplication.entities.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, String>
{

}