package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ServiceofHair {
    boolean isDeleted = false;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;


    String name;

    String description;

    int price;

    String duration;

    String stylist;


    String category;


    String serviceImage;
}
