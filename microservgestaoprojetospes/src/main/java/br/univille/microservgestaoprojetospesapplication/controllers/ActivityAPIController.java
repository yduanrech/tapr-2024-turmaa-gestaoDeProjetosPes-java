package br.univille.microservgestaoprojetospesapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Activity;

@RestController
@RequestMapping("/api/v1/activity")
public class ActivityAPIController extends GenericAPIController<Activity> 
{
    
}