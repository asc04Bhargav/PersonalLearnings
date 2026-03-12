package com.spring.xml.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(CircelConfig2.class)
public class CircleConfig {
    @Bean
    public Circle hollowCircle(){
        return new HollowCircle();
    }


    @Bean(name = "circleService")
    public CircleService cs(){
        CircleService cs = new CircleService(hollowCircle()); //constructor injection
//        cs.setC(hollowCircle());  this is setter injection
        return cs;
    }

}
