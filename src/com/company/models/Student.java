package com.company.models;

public class Student {

    private int studentId;
    private String name;
    private int startingYear;

    public Student(int studentId, String name, int startingYear) {
        this.studentId = studentId;
        this.name = name;
        this.startingYear = startingYear;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

}
