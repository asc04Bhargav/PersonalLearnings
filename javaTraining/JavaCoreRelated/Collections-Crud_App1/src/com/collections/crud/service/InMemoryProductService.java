package com.collections.crud.service;

import com.collections.crud.dao.InMemoryProductDAO;
import com.collections.crud.dao.ProductDAO;
import com.collections.crud.dto.Product;
import com.collections.crud.exceptions.ProductNotFoundException;

import java.util.List;

public class InMemoryProductService implements ProductService {

    private ProductDAO dao = new InMemoryProductDAO();

    @Override
    public void createProduct(Product product) {
        dao.createProduct(product);

    }

    @Override
    public List<Product> findAll() {
        return dao.findAll();
    }

    @Override
    public Product findById(int prodCode) throws ProductNotFoundException {
        return dao.findById(prodCode);
    }

    @Override
    public void updateProduct(Product product) {
        dao.updateProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        dao.deleteProduct(product);
    }
}
