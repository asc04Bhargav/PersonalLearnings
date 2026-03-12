package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop",Desktop.class);
        dt.compile();

        Alien alien = context.getBean(Alien.class);
        alien.code();

    }
}