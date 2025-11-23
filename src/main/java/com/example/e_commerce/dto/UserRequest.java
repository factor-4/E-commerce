package com.example.e_commerce.dto;

import com.example.e_commerce.model.UserRole;
import lombok.Data;

@Data
public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private AddressDTO address;
}
