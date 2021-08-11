package com.company;

import com.company.models.Grade;
import com.company.models.Student;
import com.company.models.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
//        int studentId, String name, int startingYear
	    Student student = new Student(0, "Brat", 1995);
	    Student student1 = new Student(1, "Bratik", 1995);
	    Student student2 = new Student(2, "Bratiki", 1994);

	    Subject subject = new Subject("Math", "Lidia Hristova");
	    subject.getStudents().add(student);
	    subject.getStudents().add(student1);
	    subject.getStudents().add(student2);

	    System.out.println("Student number 1 is " + subject.getStudents().get(0).getName());

//		int grade, Subject subject, String teacherName, int studentId

	    Subject subject2 = new Subject("BEGE", "Chavdar Spasov");
	    subject2.getStudents().add(student2);
	    Subject subject3 = new Subject("Elektrotehnika", "Valentin Ivanov");

		subject3.getStudents().add(student2);

	    Subject subject4 = new Subject("Istoriq", "Anatol Frenski");
		subject4.getStudents().add(student);
		subject4.getStudents().add(student2);
		subject4.getStudents().add(student1);

	    Subject subject5 = new Subject("CISCO", "Stela Stefanova");

		Grade grade = new Grade(2, subject, student);
		subject.getGrades().add(grade);
		Grade grade2 = new Grade(3, subject3, student);
		subject3.getGrades().add(grade2);
		Grade grade3 = new Grade(3, subject2, student2);
		subject2.getGrades().add(grade3);
		Grade grade4 = new Grade(3, subject4, student1);
		subject2.getGrades().add(grade4);

		List<Subject> allSubjects = Arrays.asList(new Subject[]{subject, subject2, subject3, subject4, subject5});

    	for (Subject subj : allSubjects) {
    		for (Grade gra : subj.getGrades()) {
    			if (gra.getGrade() == 3) {
    				System.out.println("Student: " + gra.getStudent().getName());
    				System.out.println("Grade: " + gra.getGrade());
    				System.out.println("Subject from Grade: " + gra.getSubject().getSubjectName());
    				System.out.println("Subject From Subject: " + subj.getSubjectName());
    				System.out.println("Teacher: " + gra.getSubject().getTeacherName());
    				System.out.println();
				}
			}
		}
    }
}
