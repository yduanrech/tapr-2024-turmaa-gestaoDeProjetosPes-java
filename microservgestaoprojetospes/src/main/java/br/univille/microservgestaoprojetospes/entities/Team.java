package br.univille.microservgestaoprojetospes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.GeneratedValue;
import org.springframework.data.annotation.GenerationType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.UUID;

@Container(containerName = "team", autoCreateContainer = true)
public class Team {
    @Id
    @PartitionKey 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdTeam;
    private UUID cdProject;
    private UUID cdScholarshipStudent;

    public Long getCdTeam() {
        return cdTeam;
    }

    public void setCdTeam(Long cdTeam) {
        this.cdTeam = cdTeam;
    }

    public UUID getCdProject() {
        return cdProject;
    }

    public void setCdProject(UUID cdProject) {
        this.cdProject = cdProject;
    }

    public UUID getCdScholarshipStudent() {
        return cdScholarshipStudent;
    }

    public void setCdScholarshipStudent(UUID cdScholarshipStudent) {
        this.cdScholarshipStudent = cdScholarshipStudent;
    }
}