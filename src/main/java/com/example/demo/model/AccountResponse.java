package com.example.demo.model;

import lombok.Data;

@Data
public class AccountResponse {
    long id;
    String FullName;
    String Gender;
    String email;
    String phone;
}
