package com.example.collection;

import java.util.Comparator;

public class ProdNameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProdName().compareTo(o2.getProdName());
    }
}
