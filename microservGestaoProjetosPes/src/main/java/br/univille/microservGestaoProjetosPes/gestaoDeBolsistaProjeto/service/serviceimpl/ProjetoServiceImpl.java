package br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.entity.Projeto;
import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.repository.ProjetoRepository;
import br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.service.ProjetoService;

@Service
public class ProjetoServiceImpl 
    implements ProjetoService{

    @Autowired
    private ProjetoRepository repository;
        private Projeto projeto;
    
        @Override
        public List<Projeto> getAll() {
            var retorno = repository.findAll();
            List<Projeto> listaProjetos = new ArrayList<Projeto>();
            retorno.forEach(listaProjetos::add);
    
            return listaProjetos;
        }
    
        @Override
        public Projeto save(Projeto projeto) {
            this.projeto = projeto;
            // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}

