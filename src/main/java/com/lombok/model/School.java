package com.lombok.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name ="school")
@Getter @Setter
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @Column
    private String name;

    @OneToMany
    List<Class> classes;
}
