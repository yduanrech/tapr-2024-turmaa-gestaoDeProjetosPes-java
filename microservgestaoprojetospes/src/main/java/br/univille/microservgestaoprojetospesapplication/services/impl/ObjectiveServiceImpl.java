package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Objective;
import br.univille.microservgestaoprojetospesapplication.repositories.ObjectiveRepository;

@Service
public class ObjectiveServiceImpl extends GenericServiceImpl<Objective, ObjectiveRepository>
{
    ObjectiveRepository objectiveRepository;
    
    @Override
    public Objective update(String cdObjective, Objective objective)
    {
        var getObjective = objectiveRepository.findById(cdObjective);

        if(!getObjective.isPresent()) {
            throw new RuntimeException("Objective not found with id: " + cdObjective);
        }

        var oldObjective = getObjective.get();

        oldObjective.setObjectiveTitle(objective.getObjectiveTitle());
        objectiveRepository.save(oldObjective);
        return oldObjective;
    }
}
