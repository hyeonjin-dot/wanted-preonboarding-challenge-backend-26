package com.example._6.Domain.DTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreatedAccount {
    private Long orderId;
    private String name;
    private String bankName;
    private String accountNumber;
}
