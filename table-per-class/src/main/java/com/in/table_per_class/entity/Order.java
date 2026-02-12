package com.in.table_per_class.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Controller;

@Controller

@Entity
@Table(name = "order_tbl")
public class Order {
    public Order(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String oid;

    public Order() {
    }

    private String productName;
    private int quantity;
}
