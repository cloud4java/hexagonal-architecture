package com.silva.order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> getAllOrders();

    Order createOrder(Order order);

    Optional<Order> getOrderById(Long id);
}
