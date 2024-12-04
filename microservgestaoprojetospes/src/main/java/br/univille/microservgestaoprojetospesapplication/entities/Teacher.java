package br.univille.microservgestaoprojetospesapplication.entities;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "teacher", autoCreateContainer = true, ru = "400")
public class Teacher
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdTeacher;

    private String teacherName;
    private String teacherSubs;

    public String getCdTeacher() {
        return cdTeacher;
    }

    public void setCdTeacher(String cdTeacher) {
        this.cdTeacher = cdTeacher;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSubs() {
        return teacherSubs;
    }

    public void setTeacherSubs(String teacherSubs) {
        this.teacherSubs = teacherSubs;
    }

}