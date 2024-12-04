package br.univille.microservgestaoprojetospesapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Course;

@RestController
@RequestMapping("/api/v1/course")
public class CourseAPIController extends GenericAPIController<Course> 
{
    
}