package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Cause;
import br.univille.microservgestaoprojetospesapplication.repositories.CauseRepository;

@Service
public class CauseServiceImpl extends GenericServiceImpl<Cause, CauseRepository>
{
    CauseRepository causeRepository;
    
    @Override
    public Cause update(String cdCause, Cause cause)
    {
        var getCause = causeRepository.findById(cdCause);

        if(!getCause.isPresent()) {
            throw new RuntimeException("Cause not found with id: " + cdCause);
        }

        var oldCause = getCause.get();

        oldCause.setCauseTitle(cause.getCauseTitle());
        causeRepository.save(oldCause);
        return oldCause;
    }

}