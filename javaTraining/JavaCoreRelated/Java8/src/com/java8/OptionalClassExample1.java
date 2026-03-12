package com.java8;

import java.util.Optional;

public class OptionalClassExample1 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello");  //creating optional method.
        System.out.println(o1.get());

        Optional<String> o3 = Optional.empty();
//        System.out.println(o3.get());
        System.out.println(o3.orElse("Allen"));

        Optional<String> o2=Optional.ofNullable(null);
//        System.out.println(o2.get());
        System.out.println(o2.orElse("Good evining"));





        o2.ifPresent(s -> System.out.println(s.toUpperCase()));

//        o2.map()

    }
}
