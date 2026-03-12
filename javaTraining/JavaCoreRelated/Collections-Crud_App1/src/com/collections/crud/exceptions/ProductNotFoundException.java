package com.collections.crud.exceptions;

public class ProductNotFoundException extends Exception {

    private int prodCode;

    public ProductNotFoundException() {
    }

    public ProductNotFoundException(int prodCode) {
        this.prodCode=prodCode;
    }

    @Override
    public String toString() {
        return "ProductNotFoundException{" +
                "prodCode=" + prodCode +
                '}';
    }
}
