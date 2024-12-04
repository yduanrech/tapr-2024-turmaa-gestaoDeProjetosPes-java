package br.univille.microservgestaoprojetospesapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Project;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectAPIController extends GenericAPIController<Project> 
{
    
}