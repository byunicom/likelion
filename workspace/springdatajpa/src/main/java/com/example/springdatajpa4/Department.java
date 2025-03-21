package com.example.springdatajpa4;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="departments")
@Getter
@Setter
@NoArgsConstructor
public class Department {
    @Id
    @Column(name="department_id")
    private Integer id;

    @Column(name="department_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="manager_id")
    private Employee manager;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
}
