package com.Simplon;

import java.util.ArrayList;

public class Services {

    Student student;
    ArrayList<Student> students;

    public Services(Student student/*, ArrayList<Student> etudiants*/) {
        this.student = student;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("This student is already in your list.");
        } else {
            students.add(student);
        }

    }

    public void deletStudent(Student student) {


    }

}
