package com.java8;

import java.util.Optional;

public class OptionalProduct {
    public static void main(String[] args) {
        Optional<Product> opt= Optional.of(new Product(123,"Samsung",12000));
        System.out.println(opt.get());

        Optional<Product> opt1= Optional.empty();
        System.out.println(opt1.orElse(new Product(111,"nokia",1000)));
    }
}
