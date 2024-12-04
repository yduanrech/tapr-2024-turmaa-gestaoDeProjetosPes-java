package br.univille.microservgestaoprojetospesapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Cause;

@RestController
@RequestMapping("/api/v1/cause")
public class CauseAPIController extends GenericAPIController<Cause> 
{
    
}