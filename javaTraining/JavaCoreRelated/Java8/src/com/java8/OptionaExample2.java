package com.java8;

import java.util.Optional;

public class OptionaExample2 {
    public static void main(String[] args) {
        opex1();
        opex2();
        opex3();
    }

    public static void opex1(){
        Optional<Integer> opt1 = Optional.empty();
        opt1.ifPresent(i -> System.out.println("i = " +i));
        opt1.ifPresentOrElse(i -> System.out.println("i = "+i),() -> System.out.println("Nothing"));
    }

    public static void opex2(){
        Optional<String> opt2= Optional.ofNullable(null);
        opt2.map(s -> s.toUpperCase());
    }

    public static void opex3(){
        Optional<Customer> op3 =Optional.of(new Customer(101,"Smith"));
        op3.ifPresent(c -> System.out.println(c.getCustId() +"--"+ c.getCustName()));
    }
}
