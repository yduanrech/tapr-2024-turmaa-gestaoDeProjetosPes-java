package br.univille.microservgestaoprojetospesapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Problem;

@RestController
@RequestMapping("/api/v1/problem")
public class ProblemAPIController extends GenericAPIController<Problem> 
{
    
}