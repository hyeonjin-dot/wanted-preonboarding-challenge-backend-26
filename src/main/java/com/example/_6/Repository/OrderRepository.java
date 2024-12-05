package com.example._6.Repository;

import com.example._6.Domain.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByOrderId(Long orderId);
}
