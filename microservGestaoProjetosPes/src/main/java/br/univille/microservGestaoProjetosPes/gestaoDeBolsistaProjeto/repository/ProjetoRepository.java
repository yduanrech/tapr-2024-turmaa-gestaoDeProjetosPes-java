package br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.entity.Projeto;

@Repository
public interface ProjetoRepository
    extends CrudRepository<Projeto,String> {

}
