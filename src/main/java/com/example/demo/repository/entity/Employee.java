package com.example.demo.repository.entity;

import com.example.demo.enums.ContractType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 50)
    private float salary;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ContractType contractType;

    @ManyToMany(mappedBy = "employees")
    private Set<Project> projects;

    public String getName() {
        return firstName + " " + lastName;
    }
}
