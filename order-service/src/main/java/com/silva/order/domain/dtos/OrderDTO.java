package com.silva.order.domain.dtos;


import jakarta.persistence.*;
import lombok.Data;

@Data
public class OrderDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;
    private String productName;
    private double amount;

}
