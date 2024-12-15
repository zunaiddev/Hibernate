package org.example;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int studentId;

    @Column(name = "Name")
    private String name;

    @Column(name = "University")
    private String university;

    public Student() {
    }

    ;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    @Override
    public String toString() {
        return "\nStudent:- \n" + "Id: " + this.studentId + "\nName: " + this.name + "\nUniversity: " + this.university;
    }
}
