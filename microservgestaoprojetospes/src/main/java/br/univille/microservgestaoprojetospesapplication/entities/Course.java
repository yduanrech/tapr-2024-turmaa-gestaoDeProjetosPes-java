package br.univille.microservgestaoprojetospesapplication.entities;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

public class Course {

    @Id
    @PartitionKey
    @GeneratedValue
    private String cdCourse;

    private String courseTitle;
    private String courseSubs;

    public String getCdCourse() {
        return cdCourse;
    }

    public void setCdCourse(String cdCourse) {
        this.cdCourse = cdCourse;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseSubs() {
        return courseSubs;
    }

    public void setCourseSubs(String courseSubs) {
        this.courseSubs = courseSubs;
    }
    
}
