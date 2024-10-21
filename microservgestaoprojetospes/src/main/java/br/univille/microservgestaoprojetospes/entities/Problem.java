package br.univille.microservgestaoprojetospes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.GeneratedValue;
import org.springframework.data.annotation.GenerationType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.UUID;

@Container(containerName = "problem", autoCreateContainer = true)
public class Problem {
    @Id
    @PartitionKey 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdActivity;
    private String activityTitle;
    private String activitySubs;
    private UUID cdCause;
    private UUID cdProject;

    public Long getCdActivity() {
        return cdActivity;
    }

    public void setCdActivity(Long cdActivity) {
        this.cdActivity = cdActivity;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivitySubs() {
        return activitySubs;
    }

    public void setActivitySubs(String activitySubs) {
        this.activitySubs = activitySubs;
    }

    public UUID getCdCause() {
        return cdCause;
    }

    public void setCdCause(UUID cdCause) {
        this.cdCause = cdCause;
    }

    public UUID getCdProject() {
        return cdProject;
    }

    public void setCdProject(UUID cdProject) {
        this.cdProject = cdProject;
    }

}