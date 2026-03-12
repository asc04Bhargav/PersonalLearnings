package com.spring.data.jpa.ex1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Product {
    @Id
    private int prodCode;

    @Column(name = "prod_name")
    private String prodName;
    @Column
    private double price;
    @Column
    private String category;

    public Product() {
    }

    public Product(int prodCode, String prodName, double price, String category) {
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.price = price;
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prodCode == product.prodCode && Double.compare(price, product.price) == 0 && Objects.equals(prodName, product.prodName) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodCode, prodName, price, category);
    }
}
