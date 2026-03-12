package com.collections.crud.service;

import com.collections.crud.dto.Product;
import com.collections.crud.exceptions.ProductNotFoundException;

import java.util.List;

public interface ProductService {
    void createProduct(Product p);

    List<Product> findAll();

    Product findById(int prodCode) throws ProductNotFoundException;

    void updateProduct(Product product);


//    void deleteProduct();

    void deleteProduct(Product product);
}
