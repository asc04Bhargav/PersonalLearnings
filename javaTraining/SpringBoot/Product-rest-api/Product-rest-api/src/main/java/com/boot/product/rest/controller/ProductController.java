package com.boot.product.rest.controller;

import com.boot.product.rest.dvo.Product;
//import com.boot.product.rest.repo.ProductRepository;
import com.boot.product.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping()
    public List<Product> findAll(){
        return service.findAll();
    }

    @PostMapping  //this is alter @RequestMapping(method = RequestMethod.POST)
    public Product add(@RequestBody Product product){
        return service.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return service.save(product);
    }

    @DeleteMapping("/{prodId}")
    public void delete(@PathVariable("prodId")int prodId){
        service.deleteById(prodId);
    }

    @GetMapping("/{prodId}")
    public Product findById(@PathVariable("prodId") int prodId){
        return service.findById(prodId);
    }
}

//@Controller will extend ProductController with springmvc inbuilt classes
//    eg: AbstractController
//  it also generates <bean> tag or @Bean method for declaring the object of ProductController as a beab in the spring ApplicationContext


//@ResponseBody that takes the return value from a method such as findById(),