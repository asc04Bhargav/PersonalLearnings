package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer comp){
//        Alien obj = new Alien();
//        obj.setAge(22);
//        obj.setComp(comp);
//        return obj;
//    }
//
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
