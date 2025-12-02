package com.example.e_commerce.dto;

import com.example.e_commerce.model.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
public class OrderResponse {
    private Long id;
    private BigDecimal totalAmount;
    private OrderStatus staus;
    private List<OrderItemDto> items;
    private LocalDateTime createdAt;
}
