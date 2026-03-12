package com.collections.crud.dao;

import com.collections.crud.dto.Product;
import com.collections.crud.exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductDAO implements ProductDAO {
    private List<Product> prodList =  new ArrayList<>();

    @Override
    public void createProduct(Product product) {
//        actual code that insert the product record into the database like MYSQL.MOGODB goes here in real world applications,but since we don't have db coding in this method
//        we are going to store the product object in a colection like ArrayList.. and hence the name InMemory
//        System.out.println("now adding product to bd");
        prodList.add(product);
//        System.out.println("product added");



    }

    @Override
    public List<Product> findAll() {
        return prodList;
    }

    @Override
    public Product findById(int prodCode) throws ProductNotFoundException {

        Product temp = null;
        for (Product p:prodList){
            if(p.getProdCode() == prodCode){
                temp=p;
                break;
            }
        }
        if (temp == null){
            throw new ProductNotFoundException(prodCode);
        }
        return temp;
    }

    @Override
    public void updateProduct(Product product) {
//        there a method called set() on the List interface, which is used to replace an existing object ata aspecific index
        int index = findIndex(product);

        if(index == -1 ){
            System.out.println("No matching product founr code = "+ product.getProdCode());
        }
        prodList.set(index,product);
        System.out.println("product updated");
    }

    @Override
    public void deleteProduct(Product product) {
        int index = findIndex(product);


        if(index == -1 ){
            System.out.println("No matching product founr code = "+ product.getProdCode());
        }
        prodList.remove(product);
        System.out.println("product updated");

    }

    public int findIndex(Product product){
        int index =-1;
        for (Product p : prodList){
            if (p.getProdCode() == product.getProdCode()){
                index = prodList.indexOf(p);
                break;
            }
        }
        return index;
    }
}
