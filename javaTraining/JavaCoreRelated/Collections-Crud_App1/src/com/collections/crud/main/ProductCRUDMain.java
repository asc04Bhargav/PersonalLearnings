package com.collections.crud.main;

import com.collections.crud.dto.Product;
import com.collections.crud.exceptions.ProductNotFoundException;
import com.collections.crud.service.InMemoryProductService;
import com.collections.crud.service.ProductService;

import java.util.List;

public class ProductCRUDMain {
    public static ProductService ps = new InMemoryProductService();
    public static void main(String[] args) {
        createProduct();
        System.out.println("fetching product before updating");
        fetchProducts();
        System.out.println("now updating one product... and fetching after updating..");

        updateProduct();
        fetchProducts();
        System.out.println("now deleting one object");
        deleteProduct();
        fetchProducts();
//        fetchProducts();
    }

    public static void fetchProducts(){
        List<Product> prodList = ps.findAll();
        for (Product p: prodList){
            System.out.println(p.getProdCode() +" "+p.getProdName()+" "+p.getPrice());
        }
    }

    public static void createProduct(){
//        now we are making call to createProduct(product object here) method on the ps

        ps.createProduct(new Product(1122,"S24",3500));
        ps.createProduct(new Product(1123,"S25",3800));
        ps.createProduct(new Product(1124,"16Pro",4100));

    }
    public static void updateProduct(){
        ps.updateProduct(new Product(1122,"IPhone 16 pro max",4100));
    }

    public static void deleteProduct(){
//        Product find = null;
        ps.deleteProduct(new Product(1122,"IPhone 16 pro max",4100));


    }

    public static Product findById(){
        Product find =null;
        try {
            find =ps.findById(1122);
        } catch (ProductNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("product not found exception occured..." + e);
        }
        System.out.println("product found" + find.getProdName());

        return find;
    }
}
