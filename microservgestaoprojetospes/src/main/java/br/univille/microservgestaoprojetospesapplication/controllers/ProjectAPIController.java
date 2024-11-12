package br.univille.microservgestaoprojetospesapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.servicies.ProjectService;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectAPIController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<Project>> get()
    {
        var listProjects = projectService.getAll();

        return new ResponseEntity<>(listProjects, HttpStatus.OK);
    }

}
