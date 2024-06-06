package com.silva.order.domain.ports;

import com.silva.order.infrastructure.adapters.entities.Order;

import java.util.List;
import java.util.Optional;

public interface OrderServicePort {
    List<Order> getAllOrders();

    Order createOrder(Order order);

    Optional<Order> getOrderById(Long id);
}
