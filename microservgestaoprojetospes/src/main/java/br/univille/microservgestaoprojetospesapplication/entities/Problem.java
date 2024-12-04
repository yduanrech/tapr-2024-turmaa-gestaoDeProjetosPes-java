package br.univille.microservgestaoprojetospesapplication.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "problem", autoCreateContainer = true, ru = "400")
public class Problem
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdProblem;

    private String problemTitle;
    private String problemSubs;

    public String getCdProblem() {
        return cdProblem;
    }

    public void setCdProblem(String cdProblem) {
        this.cdProblem = cdProblem;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    public String getProblemSubs() {
        return problemSubs;
    }

    public void setProblemSubs(String problemSubs) {
        this.problemSubs = problemSubs;
    }

}