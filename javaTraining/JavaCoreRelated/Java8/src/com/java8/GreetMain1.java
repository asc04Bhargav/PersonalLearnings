package com.java8;

public class GreetMain1 {
    public static void main(String[] args) {
//        Functional interface name  ref-name = here we write  lambda expression syntax,
//        (list of parameters from interface) -> {method body};
//        (String name) -> {Sout("hello world)};
        Greet g2 =System.out::println;
        g2.wish("lambda expressions");

        callGreet(name -> System.out.println("Hello" + name));

        g2.wish("return type is Greet");
    }

    public static void callGreet(Greet g){
        g.wish("hey veny what are you doing!");
    }

    public static Greet callGreet2(){
        return s -> System.out.println("Hello from lambda return"+ s);
    }
}
