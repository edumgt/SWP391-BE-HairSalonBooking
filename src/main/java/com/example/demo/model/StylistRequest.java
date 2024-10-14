package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Data
public class StylistRequest {
    @JsonIgnore // kh trả về và kh bắt user nhập thông tin
    boolean isDeleted = false; //false = not deleted

    String rating;

    String image;

    //id, image, isdeleted, rating

    List<Long> service_id;
}