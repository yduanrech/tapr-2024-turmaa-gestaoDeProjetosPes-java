package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Problem;
import br.univille.microservgestaoprojetospesapplication.repositories.ProblemRepository;

@Service
public class ProblemServiceImpl extends GenericServiceImpl<Problem, ProblemRepository>
{
    ProblemRepository problemRepository;
    
    @Override
    public Problem update(String cdProblem, Problem Problem)
    {
        var getProblem = problemRepository.findById(cdProblem);

        if(!getProblem.isPresent()) {
            throw new RuntimeException("Problem not found with id: " + cdProblem);
        }

        var oldProblem = getProblem.get();

        oldProblem.setProblemTitle(Problem.getProblemTitle());
        problemRepository.save(oldProblem);
        return oldProblem;
    }

}