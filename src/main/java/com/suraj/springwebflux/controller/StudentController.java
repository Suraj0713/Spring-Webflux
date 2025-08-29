package com.suraj.springwebflux.controller;

import com.suraj.springwebflux.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class StudentController {

    @GetMapping(value = "/students", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Student> getAllIntegers() {
        return Flux.just(new Student(1,"Abhi",32),
                new Student(2,"Suraj",28),
                new Student(3,"Nikita",26)
                ).delayElements(Duration.ofSeconds(1)).log();
    }
}
