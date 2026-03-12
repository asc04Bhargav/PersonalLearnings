package com.spring.data.jpa.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public void addOrUpdateProduct(Product p){
        repo.save(p);  //this will internally
        System.out.println("Record added or updated..");
    }

    public Product findProductById(int id){
        return repo.findById(id).orElse(null);
    }

    public void deleteProductById(int id){
        repo.deleteById(id);
        System.out.println("record deletd with id: "+ id);
    }

    public List<Product> findAllProducts(){
        return repo.findAll();
    }


}
