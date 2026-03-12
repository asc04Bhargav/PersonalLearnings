package com.boot.Product.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class ProductConsumer {
    static String url = "http://localhost:8081/products";
    static String urlWithParams = "http://localhost:8081/products/{prodId}";
    static RestTemplate template = new RestTemplate();

    public static void addRecord(){
        Product p1 = new Product(101,"Product-101",120);
        Product p2 = new Product(102,"Product-102",120);
        Product p3 = new Product(103,"Product-103",120);
        Product p4 = new Product(104,"Product-104",120);
        Product p5 = new Product(105,"Product-105",120);

        template.postForEntity(url,p1,Product.class);
        template.postForEntity(url,p2,Product.class);
        template.postForEntity(url,p3,Product.class);
        template.postForEntity(url,p4,Product.class);
        template.postForEntity(url,p5,Product.class);

        System.out.println("HTTP POST executed");
    }

    public static void getAllProducts(){
        Product p[] =template.getForObject(url,Product[].class);
        for(Product temp : p){
            System.out.println(temp.getProdName());
        }
    }

    public static void deleteProduct(){
        Map<String,Integer> paramMap = new HashMap<>();
        paramMap.put("prodId",101);
        template.delete(urlWithParams,paramMap);
    }

    public static void getProductById(){
        Map<String,Integer> paramMap= new HashMap<>();
        paramMap.put("prodId",102);
        ResponseEntity<Product> entity =template.getForEntity(urlWithParams,Product.class,paramMap);
        MediaType mt= entity.getHeaders().getContentType();
        System.out.println("Content type=" +mt);
        System.out.println("Status code= "+entity.getStatusCode());

    }



    public static void main(String[] args) {
        getProductById();
//        addRecord();
//        getAllProducts();
//        deleteProduct();

    }

}
