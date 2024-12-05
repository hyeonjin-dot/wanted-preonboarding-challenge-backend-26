package com.example._6.Domain.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Order {

    @Id
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Id
    @Column(name = "price", nullable = false)
    private Long price;
}
