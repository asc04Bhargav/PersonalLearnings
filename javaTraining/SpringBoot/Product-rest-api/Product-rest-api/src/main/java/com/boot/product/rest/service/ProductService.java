package com.boot.product.rest.service;

import com.boot.product.rest.dvo.Product;
import com.boot.product.rest.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product save(Product product){
        return repo.save(product);
    }

    public List<Product> findAll(){
        return repo.findAll();
    }

    public  void deleteById(int prodId){
        repo.deleteById(prodId);
    }

    public Product findById(int prodId){
        return repo.findById(prodId).orElse(new Product(999,"Temp Product",0));
    }
}
