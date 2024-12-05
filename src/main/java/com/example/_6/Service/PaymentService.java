package com.example._6.Service;

import com.example._6.Domain.DTO.CreatedAccount;
import com.example._6.Domain.DTO.VirtualAccountDto;
import com.example._6.Domain.Entity.Order;
import com.example._6.Repository.OrderRepository;
import com.example._6.Repository.VirtualAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PaymentService {
    private final OrderRepository orderRepository;
    private final VirtualAccountRepository virtualAccountRepository;

    //결제 진행
    public T completePayment(){
        // 결제 id, order ID
    }

    // 가상 계좌 생성
    public CreatedAccount makeVirtualAccount(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        // 가상 계좌 만들때 필요한 정보 -> 은행, 예금주, 가격

        // order는 orderId랑 가격만 있음



        return virtualAccount; // 생성된 account DTO 형태
    }

    //결제 취소
    public T cancelPayment(){
        /*
        거래 번호, 주문 번호, 환불계좌 예금주, 은행, 계좌번호, 연락처
        */
    }
}
