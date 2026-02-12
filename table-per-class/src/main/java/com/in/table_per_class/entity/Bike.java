package com.in.table_per_class.entity;

import jakarta.persistence.Entity;

@Entity
public class Bike extends Vehicle {
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Bike() {
    }

    public Bike(String colour,String noOfWheels) {
        super(noOfWheels);
        this.colour = colour;
    }

    private String colour;
}
