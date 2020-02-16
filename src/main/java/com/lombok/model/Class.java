package com.lombok.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name ="class")
@Getter @Setter
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @Column
    private String code;

    @OneToMany
    private List<Student> students;

    @OneToMany
    private List<Teacher> teachers;
}
