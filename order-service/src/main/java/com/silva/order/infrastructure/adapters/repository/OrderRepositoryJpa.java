package com.silva.order.infrastructure.adapters.repository;

import com.silva.order.infrastructure.adapters.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryJpa extends JpaRepository<Order, Long> {
}
