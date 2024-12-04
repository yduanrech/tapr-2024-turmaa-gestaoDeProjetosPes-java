package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Course;
import br.univille.microservgestaoprojetospesapplication.repositories.CourseRepository;

@Service
public class CourseServiceImpl extends GenericServiceImpl<Course, CourseRepository>
{
    CourseRepository courseRepository;
    
    @Override
    public Course update(String cdCourse, Course course)
    {
        var getCourse = courseRepository.findById(cdCourse);

        if(!getCourse.isPresent()) {
            throw new RuntimeException("Course not found with id: " + cdCourse);
        }

        var oldCourse = getCourse.get();

        oldCourse.setCourseTitle(course.getCourseTitle());
        courseRepository.save(oldCourse);
        return oldCourse;
    }

}