package com.example.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    private String name;



    @Column(unique = true,nullable = false)
    @Enumerated(EnumType.STRING)
    private Team team;

    private int age;

    private String address;

    private float height;


    @Email
    private String email;


}
