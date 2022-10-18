package com.example.demo.Student;

public class Student {
    private final String StudentName;
    private final Integer StudentId;

    public Student(String studentName, Integer studentId) {
        StudentName = studentName;
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public Integer getStudentId() {
        return StudentId;
    }
}
