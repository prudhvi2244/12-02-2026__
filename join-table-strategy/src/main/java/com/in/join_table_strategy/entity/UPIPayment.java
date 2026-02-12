package com.in.join_table_strategy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class UPIPayment  extends Payment{
    public UPIPayment(String name) {
        this.name = name;
    }

    public UPIPayment(String upiid, String name,double amount) {
        super(amount);
        this.upiid = upiid;
        this.name = name;
    }

    public String getUpiid() {
        return upiid;
    }

    public void setUpiid(String upiid) {
        this.upiid = upiid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(unique = true,nullable = false)
    private String upiid;
    private String name;

    public UPIPayment() {
    }
}
