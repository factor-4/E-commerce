package com.example.e_commerce.dto;


import lombok.Data;

@Data
public class CartItemRequest {
    private Long ProductId;
    private Integer quantity;
}
