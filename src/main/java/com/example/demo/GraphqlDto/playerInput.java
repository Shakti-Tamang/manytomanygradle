package com.example.demo.GraphqlDto;

import com.example.demo.model.Team;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInput {

    private String name;

    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private Team team;

    private int age;

    private String address;

    private float height;

    @Email
    private String email;
}