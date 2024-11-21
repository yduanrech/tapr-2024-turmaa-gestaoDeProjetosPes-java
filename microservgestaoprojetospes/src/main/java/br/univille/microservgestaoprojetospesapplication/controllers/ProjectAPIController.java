package br.univille.microservgestaoprojetospesapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.services.ProjectService;

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

    @PostMapping
    public ResponseEntity<Project> post(@RequestBody Project project)
    {
        if(project == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        var projectSaved = projectService.save(project);
        return new ResponseEntity<>(projectSaved, HttpStatus.OK);
    }

    @PutMapping("/{cdProject}")
    public ResponseEntity<Project> put(@PathVariable("cdProject") String cdProject, @RequestBody Project project)
    {
        if(project == null || cdProject == null || cdProject == "") {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        project = projectService.update(cdProject, project);
        if (project == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @DeleteMapping("/{cdProject}")
    public ResponseEntity<Project> put(@PathVariable("cdProject") String cdProject)
    {
        if(cdProject == null || cdProject == "") {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        var project = projectService.delete(cdProject);

        if (project == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(project, HttpStatus.OK);
    }

}
