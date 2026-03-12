package com.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinFunctionInterfaceMain1 {

    public static void main(String[] args) {
        m1(s -> s);
        m2(p -> p.equals("Hello"));
        m3(c -> System.out.println(c));
        m4(() -> "Supplier Interface with get() method");
    }


    public static void m1(Function<String,String> f){
        System.out.println(f.apply("Function interface apply() method"));
    }

    public static void  m2(Predicate<String> p){
        System.out.println(p.test("Hello"));
    }

    public static void m3(Consumer<String> c){
        c.accept("Consumer Interface with accept() method");
    }

    public static void  m4(Supplier<String> s){
        System.out.println(s.get());
    }

}
