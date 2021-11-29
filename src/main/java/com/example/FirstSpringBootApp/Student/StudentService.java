package com.example.FirstSpringBootApp.Student;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(
                "ABC1",
                "Vishnu",
                25,
                "vishnu@abc.com"
        ));
    }
}
