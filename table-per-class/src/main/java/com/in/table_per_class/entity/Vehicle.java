package com.in.table_per_class.entity;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Vehicle {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long vid;
    private String noOfWheels;

    public Vehicle(String noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public Vehicle() {
    }
}
