package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Teacher;
import br.univille.microservgestaoprojetospesapplication.repositories.TeacherRepository;

@Service
public class TeacherServiceImpl extends GenericServiceImpl<Teacher, TeacherRepository>
{
    TeacherRepository teacherRepository;
    
    @Override
    public Teacher update(String cdTeacher, Teacher teacher)
    {
        var getTeacher = teacherRepository.findById(cdTeacher);

        if(!getTeacher.isPresent()) {
            throw new RuntimeException("Teacher not found with id: " + cdTeacher);
        }

        var oldTeacher = getTeacher.get();

        oldTeacher.setTeacherName(teacher.getTeacherName());
        teacherRepository.save(oldTeacher);
        return oldTeacher;
    }

}