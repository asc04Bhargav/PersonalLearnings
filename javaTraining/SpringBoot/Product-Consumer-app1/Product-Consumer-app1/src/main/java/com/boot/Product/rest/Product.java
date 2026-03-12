package com.boot.Product.rest;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

import java.util.Objects;


public class Product {
    private int prodId;
    private String prodName;
    private double price;

    public Product() {
    }

    public Product(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prodId == product.prodId && Double.compare(price, product.price) == 0 && Objects.equals(prodName, product.prodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, prodName, price);
    }

}
