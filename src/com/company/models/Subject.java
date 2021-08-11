package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String subjectName;
    private String teacherName;
    private List<Student> students = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();

    public Subject(String subjectName, String teacherName) {
        this.subjectName = subjectName;
        this.teacherName = teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
