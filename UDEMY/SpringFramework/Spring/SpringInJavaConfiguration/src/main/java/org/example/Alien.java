package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    public Alien(){
        System.out.println("Alien object created");
    }

    @Value("21")
    private int age;

//    @Qualifier("laptop")
    private Computer comp;

    public Alien(int age, Computer comp){
        System.out.println(age + "," + comp);
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
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
        System.out.println("coding"+"  "+getAge());
        comp.compile();
    }


}
