package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Team;
import br.univille.microservgestaoprojetospesapplication.repositories.TeamRepository;

@Service
public class TeamServiceImpl extends GenericServiceImpl<Team, TeamRepository>
{
    TeamRepository teamRepository;
    
    @Override
    public Team update(String cdTeam, Team team)
    {
        var getTeam = teamRepository.findById(cdTeam);

        if(!getTeam.isPresent()) {
            throw new RuntimeException("Team not found with id: " + cdTeam);
        }

        var oldTeam = getTeam.get();

        // implementar o att
        return oldTeam;
    }

}