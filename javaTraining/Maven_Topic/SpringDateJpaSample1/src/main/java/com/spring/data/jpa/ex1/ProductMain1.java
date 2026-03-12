package com.spring.data.jpa.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ProductMain1 {
    static ApplicationContext ctx = null;
    static ProductService ps =null;
    public static void main(String[] args) {
         ctx = new AnnotationConfigApplicationContext(JpaConfig1.class);

         addRecords();
         findById(102);
        deleteById(105);
        findAllProducts();

    }

    public static void addRecords(){
        ps =ctx.getBean(ProductService.class);
        ps.addOrUpdateProduct(new Product(101,"Product-101",100,"category-a"));
        ps.addOrUpdateProduct(new Product(102,"Product-102",115,"category-a"));
        ps.addOrUpdateProduct(new Product(103,"Product-103",320,"category-b"));
        ps.addOrUpdateProduct(new Product(104,"Product-104",1250,"category-b"));
        ps.addOrUpdateProduct(new Product(105,"Product-105",340,"category-b"));
        ps.addOrUpdateProduct(new Product(106,"Product-106",118,"category-c"));


    }

    public static void findById(int prodCode){
        Product ps1=ps.findProductById(prodCode);
        System.out.println(ps1.getProdCode()+" "+ps1.getProdName()+" "+ps1.getPrice()+" "+ps1.getCategory());

    }

    public static void deleteById(int prodCode){
        ps.deleteProductById(prodCode);

    }

    public static void findAllProducts(){
        List<Product> listProduct = ps.findAllProducts();

        for (Product product: listProduct){
            System.out.println(product.getProdCode()+" "+ product.getProdName()+" "+product.getCategory()+" "+product.getPrice());
        }

    }
}
