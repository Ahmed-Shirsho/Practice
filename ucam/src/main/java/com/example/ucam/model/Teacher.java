package com.example.ucam.model;


import javax.persistence.Entity;

@Entity

public class Teacher extends User {

    private String teacherData;

    public String getTeacherData() {
        return teacherData;
    }

    public void setTeacherData(String teacherData) {
        this.teacherData = teacherData;
    }
}