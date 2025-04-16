package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String name;
    private String address;
    private int symbolNumber;
    private long cotactNumber;

    @Email
    private String email;

    private String faculty;
    private String batch;

    @ManyToMany(mappedBy = "studentList", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnoreProperties("studentList")
    private List<Course> courseList = new ArrayList<>();

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    @JsonManagedReference("usersProduct")
    private List<Product>productList=new ArrayList<>();
}
