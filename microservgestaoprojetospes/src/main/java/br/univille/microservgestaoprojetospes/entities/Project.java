package br.univille.microservgestaoprojetospes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.GeneratedValue;
import org.springframework.data.annotation.GenerationType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.UUID;

@Container(containerName = "project", autoCreateContainer = true)
public class Project {
    @Id
    @PartitionKey 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdProject;
    private String projectTitle;
    private String projectSubs;
    private statusEnum status;
    private UUID cdTeam;
    private UUID cdCourse;
    private UUID cdProblem;
    private UUID cdObjective;
    private UUID cdActivity;

    public Long getCdProject() {
        return cdProject;
    }

    public void setCdProject(Long cdProject) {
        this.cdProject = cdProject;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectSubs() {
        return projectSubs;
    }

    public void setProjectSubs(String projectSubs) {
        this.projectSubs = projectSubs;
    }

    public statusEnum getStatus() {
        return status;
    }

    public void setStatus(statusEnum status) {
        this.status = status;
    }

    public UUID getCdTeam() {
        return cdTeam;
    }

    public void setCdTeam(UUID cdTeam) {
        this.cdTeam = cdTeam;
    }

    public UUID getCdCourse() {
        return cdCourse;
    }

    public void setCdCourse(UUID cdCourse) {
        this.cdCourse = cdCourse;
    }

    public UUID getCdProblem() {
        return cdProblem;
    }

    public void setCdProblem(UUID cdProblem) {
        this.cdProblem = cdProblem;
    }

    public UUID getCdObjective() {
        return cdObjective;
    }

    public void setCdObjective(UUID cdObjective) {
        this.cdObjective = cdObjective;
    }

    public UUID getCdActivity() {
        return cdActivity;
    }

    public void setCdActivity(UUID cdActivity) {
        this.cdActivity = cdActivity;
    }
}