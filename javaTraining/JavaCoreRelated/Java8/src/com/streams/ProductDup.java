package com.streams;

import java.util.Objects;

public class ProductDup {
    private int prodCode;
    private String prodName;
    private int price;
    private int q0h;
    private String category;

    public ProductDup() {
    }

    public ProductDup(int prodCode, String prodName, int price, int q0h, String category) {
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.price = price;
        this.q0h = q0h;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQ0h() {
        return q0h;
    }

    public void setQ0h(int q0h) {
        this.q0h = q0h;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductDup{" +
                "prodCode=" + prodCode +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                ", q0h=" + q0h +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDup that = (ProductDup) o;
        return prodCode == that.prodCode && price == that.price && q0h == that.q0h && Objects.equals(prodName, that.prodName) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodCode, prodName, price, q0h, category);
    }
}
