package com.example.demo.model;

import com.example.demo.entity.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ServiceRequest {
    @JsonIgnore
    boolean isDeleted = false;

    @NotBlank(message = "Category can't be blank!")
    String name;

    @NotBlank(message = "Category can't be blank!")
    String description;

    String price;

    @NotBlank(message = "Category can't be blank!")
    String duration;

    @NotBlank(message = "Category can't be blank!")
    String serviceImage;

    @NotBlank(message = "Category can't be blank!")
    String date;

    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    Category category;
}
