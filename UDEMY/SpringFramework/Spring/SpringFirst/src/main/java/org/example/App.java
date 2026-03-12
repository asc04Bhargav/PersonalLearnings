package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        to make spring to manage object use ApplicationContext
//        below line creates a container for us and also all objects mentioned in the xml bean tag
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Using an object
        Alien obj = (Alien)context.getBean("alien");
//        Another way to create object
//        Alien obj= context.getBean(Alien.class);
        obj.code();

//        Laptop obj1 =(Laptop)context.getBean("lap");
//
//        System.out.println(obj.getAge());

    }
}
