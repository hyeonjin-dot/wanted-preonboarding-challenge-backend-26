package com.example._6.Domain.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "virtual_account")
public class VirtualAccount {

    @Id
    @Column(name = "merchant_uid", nullable = false)
    private String merchantUid;

    @Column(name = "amount", nullable = false)
    private Long amount;

    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    private ProductType product_type;

    @Column(name = "vbank_num")
    private String vbankNum;

    @Column(name = "vbank_code", nullable = false)
    private String vbankCode;

    @Column(name = "vbank_due", nullable = false)
    private Long vbankDue;

    @Column(name = "vbank_holder")
    private String vbankHolder;

    @Column(name = "vbank_key")
    private String vbankKey;

    @Column(name = "name")
    private String name;

    @Column(name = "buyer_name")
    private String buyerName;

    @Column(name = "buyer_email")
    private String buyerEmail;

    @Column(name = "buyer_tel")
    private String buyerTel;

    @Column(name = "business_registration_number")
    private String businessRegistrationNumber;

    @Column(name = "buyer_addr")
    private String buyerAddr;

    @Column(name = "buyer_postcode")
    private String buyerPostcode;

    @Column(name = "pg")
    private String pg;

    @Column(name = "notice_url")
    private List<String> noticeUrl;

    @Column(name = "custom_date")
    private String customDate;

    @Column(name = "tax_free")
    private Long taxFree;

    @Column(name = "vat_amount")
    private Long vatAmount;

    @Column(name = "product_count")
    private Long productCount;

    public enum ProductType {
        REAL, DIGITAL
    }
}
