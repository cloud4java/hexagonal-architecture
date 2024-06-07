package com.silva.order.domain.adapters.services;


import com.silva.order.domain.ports.OrderServicePort;
import com.silva.order.infrastructure.adapters.entities.Order;
import com.silva.order.infrastructure.adapters.repository.OrderRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderServicePort {

    private final OrderRepositoryJpa orderRepositoryJpa;

    @Autowired
    public OrderServiceImpl(OrderRepositoryJpa orderRepositoryJpa) {
        this.orderRepositoryJpa = orderRepositoryJpa;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepositoryJpa.findAll();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepositoryJpa.save(order);
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepositoryJpa.findById(id);
    }
}
