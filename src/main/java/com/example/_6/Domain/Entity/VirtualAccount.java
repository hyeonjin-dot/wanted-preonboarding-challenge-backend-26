package com.example._6.Domain.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class VirtualAccount {
    @Id
    @Column(name = "payment_id", nullable = false)
    private String paymentId;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "bank_code", nullable = false)
    private Long bankCode;
}
