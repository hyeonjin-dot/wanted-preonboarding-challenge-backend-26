package com.example._6.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vbanks")
public class VirtualAccountController {
    // 계좌 발급
    @PostMapping
    public ResponseEntity<?> makeAccount(@RequestParam String pg_api_key,
                                         @RequestBody VirtualAccountRequestDTO virtualAccountRequestDTO){

    }

    // 발급 계좌 수정
    @PutMapping("/{imp_uid}")
    public ResponseEntity<?> updateAccount(@PathVariable String imp_uid,
                                           @RequestBody UpdateVaccountRequestDTO virtualAccountRequestDTO){

    }

    // 발급 계좌 삭제
    @DeleteMapping("/{imp_uid}")
    public ResponseEntity<?> deleteAccount(@PathVariable String imp_uid,
                                           @RequestParam String pg_api_key){

    }

    // 예금주 조회
    @GetMapping("/holder")
    public ResponseEntity<?> getAccountHolder(@RequestParam String bank_code,
                                              @RequestParam String bank_num){

    }
}
