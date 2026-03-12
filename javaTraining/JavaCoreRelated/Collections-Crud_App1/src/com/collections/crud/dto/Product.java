package com.collections.crud.dto;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private int prodCode;
    private String prodName;
    private double price;

    public Product() {
    }

    public Product(int prodCode, String prodName, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodCode=" + prodCode +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prodCode == product.prodCode && Double.compare(price, product.price) == 0 && Objects.equals(prodName, product.prodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodCode, prodName, price);
    }


    @Override
    public int compareTo(Product o) {
        return this.prodCode - o.prodCode;
    }
}
