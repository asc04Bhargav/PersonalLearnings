package com.spring.xml.ex1;

import org.springframework.context.annotation.Bean;

public class CircelConfig2 {
    @Bean
    public Circle solidCircle(){
        return  new SolidCircle();
    }
}
