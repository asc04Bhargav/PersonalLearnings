package com.spring.JavaConfig.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.JavaConfig.ex1")
public class BeanConfig1 {
    @Bean
    public DebitCaredCheckout dc(){
        return new DebitCaredCheckout();
    }

    @Bean
    public NetBankingCheckout nc(){
        return new NetBankingCheckout();
    }

    @Bean
    public EmailNotificationSender ens(){
        return new EmailNotificationSender();
    }

    @Bean
    public WatsappNotificationSender wns(){
        return new WatsappNotificationSender();
    }

//    @Bean("orderProcess")
//    public OrderProcessor op(){
//        OrderProcessor opc = new OrderProcessor();
//        opc.setChechout(nc());
//        opc.setNotificationSender(wns());
//        return opc;
//    }

}
