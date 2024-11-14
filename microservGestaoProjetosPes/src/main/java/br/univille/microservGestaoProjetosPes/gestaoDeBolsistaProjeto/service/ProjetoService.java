package br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.service;

import java.util.List;

import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.entity.Projeto;

public interface ProjetoService {
    List<Projeto> getAll();
    Projeto save(Projeto projeto);
    Projeto update(String id, Projeto projeto);
    Projeto delete(String id);
}
