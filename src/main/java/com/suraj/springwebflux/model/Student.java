package com.suraj.springwebflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table("students")
public class Student {

    @Id
    private Integer id;
    private String name;
    private Integer age;

}
