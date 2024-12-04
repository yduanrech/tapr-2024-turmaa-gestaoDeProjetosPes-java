package br.univille.microservgestaoprojetospesapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Objective;

@RestController
@RequestMapping("/api/v1/objective")
public class ObjectiveAPIController extends GenericAPIController<Objective> 
{
    
}