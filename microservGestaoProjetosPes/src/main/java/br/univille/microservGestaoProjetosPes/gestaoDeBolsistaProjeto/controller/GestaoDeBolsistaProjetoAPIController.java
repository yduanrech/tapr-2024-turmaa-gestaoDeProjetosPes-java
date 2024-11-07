package br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.controller;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.entity.Projeto;
import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.service.ProjetoService;

@RestController
@RequestMapping("/api/v1/projetos")
public class GestaoDeBolsistaProjetoAPIController {
    
    @Autowired
    private ProjetoService service;

    @GetMapping
    public ResponseEntity<List<Projeto>> get(){
        var listaProjeto = service.getAll();

        return new ResponseEntity<List<Projeto>>(listaProjeto, HttpStatus.OK);
    }
}
