package com.java8;

public class FullnameMain1 {
    public static void main(String[] args) {
        FullName f1 = ((fname, lname) -> System.out.println(fname+" "+lname));
        f1.showName("bhargav","veerabommala");


    }
}
