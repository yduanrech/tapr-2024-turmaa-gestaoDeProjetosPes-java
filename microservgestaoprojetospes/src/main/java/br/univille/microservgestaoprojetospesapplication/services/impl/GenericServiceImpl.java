package br.univille.microservgestaoprojetospesapplication.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import br.univille.microservgestaoprojetospesapplication.services.GenericService;

public abstract class GenericServiceImpl<T,Q extends CrudRepository> implements GenericService<T> {

    @Autowired
    Q repository;

    @Override
    public List<T> getAll() {
        Iterable<T> retornoIterador = repository.findAll();
        List<T> list = new ArrayList<>();
        
        retornoIterador.forEach(list::add);
        return list;
    }

    @Override
    public T save(T object) {
        return (T)repository.save(object);
    }

    public abstract  T update(String id, T object);

    @Override
    public T delete(String id) {
        var search = repository.findById(id);
        if(search.isPresent()){
            var obj = search.get();
            repository.delete(obj);
            return (T)obj;
        }
        return null;
    }
    
}
