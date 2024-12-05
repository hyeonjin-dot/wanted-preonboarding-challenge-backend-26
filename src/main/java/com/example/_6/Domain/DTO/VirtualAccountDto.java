package com.example._6.Domain.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class VirtualAccountDto {
    String paymentId;
    Long price;
    String name;
    Long bankCode;


    @Builder
    public VirtualAccountDto(String id, Long price, String name, Long bankCode) {
        this.paymentId = id;
        this.price = price;
        this.name = name;
        this.bankCode = bankCode;
    }
}
