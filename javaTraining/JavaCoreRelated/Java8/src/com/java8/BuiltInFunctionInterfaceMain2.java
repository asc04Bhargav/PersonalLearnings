package com.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionInterfaceMain2 {

    public static void productConsumer(Consumer<Product> c){
        c.accept(new Product(123,"samsung",2000.0));
    }
    public static void productSupplier(Supplier<Product> s){
        System.out.println(s.get());
    }

    public  static void productFunction(Function<Product,Double> f){
        System.out.println(f.apply(new Product(123,"16 Plus",41000)));
    }

    public  static void productPredicate(Predicate<Product> p){
        System.out.println(p.test(new Product(12,"samsung",1234)));
    }
    public static void main(String[] args) {
        productFunction(product -> product.getPrice());
        productPredicate(product -> product.getPrice() > 1000 );
        productSupplier(() ->new Product(123,"adja",2212));
        productConsumer(product -> System.out.println(product.getPrice()+1500.0));
    }
}
