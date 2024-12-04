package br.univille.microservgestaoprojetospesapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.univille.microservgestaoprojetospesapplication.services.GenericService;

public abstract class GenericAPIController<T> {

    @Autowired
    private GenericService<T> genericService;

    @GetMapping
    public ResponseEntity<List<T>> get() {
        var list = genericService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<T> post(@RequestBody T entity) {
        if (entity == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        var savedEntity = genericService.save(entity);
        return new ResponseEntity<>(savedEntity, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> put(@PathVariable("id") String id, @RequestBody T entity) {
        if (entity == null || id == null || id.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        entity = genericService.update(id, entity);
        if (entity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<T> delete(@PathVariable("id") String id) {
        if (id == null || id.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        var entity = genericService.delete(id);
        if (entity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(entity, HttpStatus.OK);
    }
}