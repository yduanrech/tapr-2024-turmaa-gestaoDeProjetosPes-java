package br.univille.microservgestaoprojetospes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.GeneratedValue;
import org.springframework.data.annotation.GenerationType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.String;

@Container(containerName = "cause", autoCreateContainer = true)
public class Cause {
    @Id
    @PartitionKey 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdCause;
    private String causeTitle;
    private String causeSubs;
    private String cdProblem;

    public Long getCdCause() {
        return cdCause;
    }

    public void setCdCause(Long cdCause) {
        this.cdCause = cdCause;
    }

    public String getCauseTitle() {
        return causeTitle;
    }

    public void setCauseTitle(String causeTitle) {
        this.causeTitle = causeTitle;
    }

    public String getCauseSubs() {
        return causeSubs;
    }

    public void setCauseSubs(String causeSubs) {
        this.causeSubs = causeSubs;
    }

    public String getCdProblem() {
        return cdProblem;
    }

    public void setCdProblem(String cdProblem) {
        this.cdProblem = cdProblem;
    }
}