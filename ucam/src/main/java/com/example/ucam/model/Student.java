package com.example.ucam.model;




import javax.persistence.Entity;


@Entity
public class Student extends User {

    private String studentData;

    public String getStudentData() {
        return studentData;
    }

    public void setStudentData(String studentData) {
        this.studentData = studentData;
    }

}