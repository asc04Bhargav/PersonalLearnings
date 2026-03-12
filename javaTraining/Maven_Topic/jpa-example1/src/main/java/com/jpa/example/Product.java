package com.jpa.example;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id  //this annotation marks the prodCode as a column which will be mapped to prodcode PK column in the db table
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prodCode;
    @Column
    private String prodName;

    @Column
    private Double price;

    public Product() {
    }

    public Product(int prodCode, String prodName, Double price) {
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdCode() {
        return prodCode;
    }

    public void setProdCode(int prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
