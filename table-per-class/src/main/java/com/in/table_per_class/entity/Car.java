package com.in.table_per_class.entity;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    public Car(String engineType,String noOfWheels) {
        super(noOfWheels);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {

        this.engineType = engineType;
    }

    public Car() {
    }

    private String engineType;
}
