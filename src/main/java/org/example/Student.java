package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int studentId;
    private String name;
    private String university;

    public Student(){};

    public Student(int sId, String name, String university){
        this.studentId = sId;
        this.name = name;
        this.university = university;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }
}
