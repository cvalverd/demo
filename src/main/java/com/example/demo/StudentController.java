package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>();
    
    public StudentController() {
        // Inicializa la lista de estudiantes con algunos datos

        students.add(new Student(1, "Estudiante 1",23));
        students.add(new Student(2, "Estudiante 2",25));
        students.add(new Student(3, "Estudiante 3", 34));

    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    
}
