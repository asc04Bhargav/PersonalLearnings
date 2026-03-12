package com.java8;

public class CircleMain1{
    public static void main(String[] args) {
//        Circle c1 = radius -> System.out.println(3.14 * (radius * radius));

//        c1.area(12);

        m1(radius -> 3.14*radius*radius);
    }

    public static void m1(Circle c1){
        System.out.println(c1.area(2.3));

    }

}
