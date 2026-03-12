package com.spring.xml.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlMain1 {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");

        CircleService cs = ctx.getBean(CircleService.class);

        cs.drawCircel();

    }
}
