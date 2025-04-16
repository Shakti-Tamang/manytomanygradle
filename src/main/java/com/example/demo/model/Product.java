package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long  productId;



    private String productName;


    private String productCategory;


    private int productQuantity;

    private double productRate;


    private String productDescription;

    @ManyToOne()
    @JoinColumn(name = "Students_Id")
    @JsonBackReference("usersProduct")
    private Student student;

    
    
}
