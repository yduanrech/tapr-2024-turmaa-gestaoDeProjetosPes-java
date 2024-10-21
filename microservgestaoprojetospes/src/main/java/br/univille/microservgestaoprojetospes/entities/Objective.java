package br.univille.microservgestaoprojetospes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.GeneratedValue;
import org.springframework.data.annotation.GenerationType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.UUID;

@Container(containerName = "objective", autoCreateContainer = true)
public class Objective {
    @Id
    @PartitionKey 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdObjective;
    private String objectiveTitle;
    private String objectiveSubs;
    private UUID cdProject;

    public Long getCdObjective() {
        return cdObjective;
    }

    public void setCdObjective(Long cdObjective) {
        this.cdObjective = cdObjective;
    }

    public String getObjectiveTitle() {
        return objectiveTitle;
    }

    public void setObjectiveTitle(String objectiveTitle) {
        this.objectiveTitle = objectiveTitle;
    }

    public String getObjectiveSubs() {
        return objectiveSubs;
    }

    public void setObjectiveSubs(String objectiveSubs) {
        this.objectiveSubs = objectiveSubs;
    }

    public UUID getCdProject() {
        return cdProject;
    }

    public void setCdProject(UUID cdProject) {
        this.cdProject = cdProject;
    }
}