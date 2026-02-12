package com.in.join_table_strategy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class CreditCardPayment extends Payment{

    public CreditCardPayment(Long cardNo, String expiry, int cvv) {
        this.cardNo = cardNo;
        this.expiry = expiry;
        this.cvv = cvv;
    }

    public CreditCardPayment(double amount, Long cardNo, String expiry, int cvv) {
        super(amount); // call to super class constructor
        this.cardNo = cardNo;
        this.expiry = expiry;
        this.cvv = cvv;
    }

    public CreditCardPayment() {
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Column(unique = true,nullable = false)
    private Long cardNo;
    private String expiry;
    private int cvv;

}
