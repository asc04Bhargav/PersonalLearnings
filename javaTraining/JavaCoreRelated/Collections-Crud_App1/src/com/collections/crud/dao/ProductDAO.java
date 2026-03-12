package com.collections.crud.dao;

import com.collections.crud.dto.Product;
import com.collections.crud.exceptions.ProductNotFoundException;

import java.util.List;

public interface ProductDAO {
    void createProduct(Product product);

    List<Product> findAll();

    Product findById(int prodCode) throws ProductNotFoundException;

//    to update product , we have different options
//    1.get a  productId and a complete object to replace the product object in arrayList
//    2.get an entire Product object and replace it in arrayList

    void updateProduct(Product product);

    void deleteProduct(Product product);
}
