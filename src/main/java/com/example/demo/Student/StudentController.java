package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS= Arrays.asList(
        new Student("A",1),new Student("B",2),new Student("C",3));

    @GetMapping(path = "{StudentId}")
    public Student getStudent(@PathVariable("StudentId") Integer StudentId){
        return STUDENTS.stream().filter(student -> StudentId.equals(student.getStudentId())).findFirst().orElseThrow(()->
                new IllegalStateException("Studnet "+StudentId+"Does not exist"));
    }
}
