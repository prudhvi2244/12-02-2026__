package com.in.join_table_strategy.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private double amount;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



    public Payment() {
    }

    public Payment(double amount) {
        this.amount = amount;
    }
}
