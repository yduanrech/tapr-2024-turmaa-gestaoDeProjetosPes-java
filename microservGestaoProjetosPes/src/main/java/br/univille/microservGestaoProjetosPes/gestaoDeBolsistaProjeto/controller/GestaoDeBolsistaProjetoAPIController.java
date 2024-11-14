package br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.entity.Projeto;
import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.service.ProjetoService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


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

    @PostMapping
    public ResponseEntity<Projeto> post(@RequestBody Projeto projeto){

        if(projeto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var projetoSalvo = service.save(projeto);
        return new ResponseEntity<Projeto>(projetoSalvo, HttpStatus.OK);
    }

    @PutMapping("path/{id}")
    public ResponseEntity<Projeto> put(
                    @PathVariable("id") String id,
                    @RequestBody Projeto projeto){
                if(projeto == null || id = "" || id == null){
                    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                }
                projeto = service.update(id, projeto);
                if(projeto == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>(projeto,HttpStatus.OK);
            }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Projeto> delete(
                    @PathVariable("id") String id){
                if(id = "" || id == null){
                    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                }
                projeto = service.delete(id);
                if(projeto == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>(projeto,HttpStatus.OK);
            }
    }
}
