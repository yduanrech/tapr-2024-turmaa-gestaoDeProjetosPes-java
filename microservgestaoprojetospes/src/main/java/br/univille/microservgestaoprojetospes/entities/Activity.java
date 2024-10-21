package br.univille.microservgestaoprojetospes.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.GeneratedValue;
import org.springframework.data.annotation.GenerationType;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.sql.Date;
import java.util.UUID;

@Container(containerName = "activity", autoCreateContainer = true)
public class Activity {
    @Id
    @PartitionKey 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdActivity;
    private String activityTitle;
    private String activitySubs;
    private Date dtStart;
    private Date dtEnd;

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

    public Date getDtStart() {
        return dtStart;
    }

    public void setDtStart(Date dtStart) {
        this.dtStart = dtStart;
    }

    public Date getDtEnd() {
        return dtEnd;
    }

    public void setDtEnd(Date dtEnd) {
        this.dtEnd = dtEnd;
    }
}