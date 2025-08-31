package com.suraj.springwebflux.repository;

import com.suraj.springwebflux.model.Student;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student,Integer> {

    @Query("SELECT s.id, s.name,s.age FROM students s")
    Flux<Student> findAllStudents();
}
