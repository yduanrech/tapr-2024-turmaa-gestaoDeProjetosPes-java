package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;

public interface GenericService<T> {
    List<T> getAll();
    T save(T object);
    T update(String id, T object);
    T delete(String id);
}
