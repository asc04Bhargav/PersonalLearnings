package com.streams;

import com.java8.Product;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductStreamMain1 {
    public static void main(String[] args) {
//        forEachDemo();
//        findAndCollect();
//        findByPriceGreaterThan();
//        findByCategory();
//        increasePriceForMobileBy100AndPrint();
//        findProductWithMaxPrice();
//        sortByProdName();
        priceSuummary();
    }


    public static void forEachDemo(){
        ProductData.prodList.stream().forEach(System.out::println);
    }

    public static void findAndCollect(){
        Integer productCodes[] = {101,105,106,202,205,206};
        Stream.of(productCodes)
                .map(ProductData::findProduct)
                .collect(Collectors.toList())
                .forEach(p -> System.out.println(p.getProdCode() +" "+ p.getProdName()));

    }

    public static void findByPriceGreaterThan(){
        ProductData.prodList.stream()
                .filter(p->p.getPrice()>500)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void findByCategory(){
        ProductData.prodList.stream()
                .filter(p->p.getCategory().equals("Mobile Phones"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void increasePriceForMobileBy100AndPrint(){
        ProductData.prodList.stream()
                .filter(p->p.getCategory().equals("Mobile Phones"))
                .map(p -> {
                    p.setPrice(p.getPrice()+100);
                    return p;
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void findProductWithMaxPrice(){
        ProductData.prodList.stream()
                .max((p1,p2)->p1.getPrice()- p2.getPrice())
                .ifPresent(System.out::println);
    }

    public static void sortByProdName(){
        ProductData.prodList.stream()
                .sorted((p1,p2)-> p1.getProdName().compareTo(p2.getProdName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void priceSuummary(){
        DoubleSummaryStatistics stats = ProductData.prodList.stream()
                .collect(Collectors.summarizingDouble(ProductDup::getPrice));
        System.out.println("Average ="+stats.getAverage());
        System.out.println("max ="+stats.getMax());
    }
}

