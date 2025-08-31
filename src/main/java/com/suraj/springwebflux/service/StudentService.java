package com.suraj.springwebflux.service;

import com.suraj.springwebflux.model.Student;
import com.suraj.springwebflux.repository.StudentRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class StudentService {

    final private StudentRepository studentRepository;

    public StudentService(final StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Flux<Student> getAllStudents(){
        //This delays each emitted row by 1 second without hacking SQL.
        return studentRepository.findAllStudents().delayElements(Duration.ofSeconds(1));
    }
}
