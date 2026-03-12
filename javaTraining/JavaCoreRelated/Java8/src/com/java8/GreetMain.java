package com.java8;

public class GreetMain {
    public static void main(String[] args) {
        Greet g1 = new Greet() {
            @Override
            public void wish(String msg) {
                System.out.println("This is anonymous class concept");
                System.out.println(msg);
            }
        };

        g1.wish("Happy Birthday");
    }
}
