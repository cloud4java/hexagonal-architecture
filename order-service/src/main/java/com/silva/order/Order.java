package com.silva.order;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;
    private String productName;
    private double amount;

}
