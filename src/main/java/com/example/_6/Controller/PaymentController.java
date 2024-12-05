package com.example._6.Controller;

import com.example._6.Service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    //결제 진행

    // 가상 계좌 생성
    @PostMapping("/{orderId}")
    public ResponseEntity<T> makeVirtualAccount(@PathVariable("orderId") Long orderId) {
        return paymentService.makeVirtualAccount(orderId);
    }

    //결제 취소

}
