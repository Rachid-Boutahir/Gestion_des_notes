package com.Simplon;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String FullName;
    private List<Subject> Subjects;

    public Student(String FullName/*, List Subjects*/) {
        this.FullName = FullName;
        this.Subjects = new ArrayList<Subject>();
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public List<Subject> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<Subject> Subjects) {
        this.Subjects = Subjects;
    }

    @Override
    public String toString() {
        return "Etudiant:{" + "FullName=" + FullName + ", Subjects=" + Subjects + '}';
    }

}
