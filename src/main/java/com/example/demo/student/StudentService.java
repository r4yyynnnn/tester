package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Raynn",
                        "kuda.terbang@gmail.com",
                        LocalDate.of(2006, Month.FEBRUARY, 7),
                        21
                )
        );
    }
}
