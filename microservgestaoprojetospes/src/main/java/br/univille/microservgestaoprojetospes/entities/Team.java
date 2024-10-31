package br.univille.microservgestaoprojetospes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.GeneratedValue;
import org.springframework.data.annotation.GenerationType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.String;

@Container(containerName = "team", autoCreateContainer = true)
public class Team {
    @Id
    @PartitionKey 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdTeam;
    private String cdProject;
    private String cdScholarshipStudent;

    public Long getCdTeam() {
        return cdTeam;
    }

    public void setCdTeam(Long cdTeam) {
        this.cdTeam = cdTeam;
    }

    public String getCdProject() {
        return cdProject;
    }

    public void setCdProject(String cdProject) {
        this.cdProject = cdProject;
    }

    public String getCdScholarshipStudent() {
        return cdScholarshipStudent;
    }

    public void setCdScholarshipStudent(String cdScholarshipStudent) {
        this.cdScholarshipStudent = cdScholarshipStudent;
    }
}