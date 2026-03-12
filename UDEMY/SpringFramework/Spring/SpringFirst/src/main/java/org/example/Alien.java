package org.example;

import java.beans.ConstructorProperties;

public class Alien{
    private int age;
    private Computer comp;

    public Alien(){
        System.out.println("Object Created");
    }
//    @ConstructorProperties({"n1","n2"})
    public Alien(int age,Computer comp){
        System.out.println("Constructor invoked");
        System.out.println(age + ","+ comp);
    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void code(){
        System.out.println("coding");
        comp.compile();
    }
}
