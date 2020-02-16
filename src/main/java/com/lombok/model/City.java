package com.lombok.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
@Table(name="city")
@Getter @Setter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @Column
    private String name;

    @Column
    private String plateCode;

    @OneToMany
    private List<School> schools;
}
