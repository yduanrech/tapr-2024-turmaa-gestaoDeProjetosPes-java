package br.univille.microservGestaoProjetosPes.gestaoDeBolsistaProjeto.entity;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;



@Container(containerName = "projeto", autoCreateContainer = true)
public class Projeto {
    
    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private String nome;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
