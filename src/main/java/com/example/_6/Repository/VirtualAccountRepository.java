package com.example._6.Repository;

import com.example._6.Domain.DTO.CreatedAccount;
import com.example._6.Domain.Entity.VirtualAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualAccountRepository extends JpaRepository<VirtualAccount, String> {
}
