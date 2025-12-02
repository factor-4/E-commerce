package com.example.e_commerce.dto;

import lombok.Data;


import java.math.BigDecimal;

@Data
public class CartItemResponse {


    private Integer quantity;
    private BigDecimal price;


}
