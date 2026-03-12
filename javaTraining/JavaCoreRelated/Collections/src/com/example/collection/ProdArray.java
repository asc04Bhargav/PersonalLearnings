package com.example.collection;

import java.util.Arrays;
import java.util.List;

public class ProdArray {
    public static void main(String[] args) {
        Product product[]= {new Product(1,"samsung",20000),new Product(2,"realme",31000),new Product(4,"vivo",40000)};

        List<Product> pro = Arrays.asList(product);
        System.out.println(pro);

        Arrays.sort(product,new ProdNameComparator());
        for (Product p1:product){
            System.out.println(p1.getProdCode()+ " "+ p1.getProdName());
        }
    }

}
