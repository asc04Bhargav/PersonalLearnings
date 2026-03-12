package com.spring.JavaConfig.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoMain1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig1.class);
        OrderProcessor op = ctx.getBean(OrderProcessor.class);

//        OrderProcessor op1 = (OrderProcessor) ctx.getBean("orderProcess");
//        System.out.println(ctx.getBean(OrderProcessor.class).getChechout());
//        System.out.println(ctx.getBean(OrderProcessor.class).getNotificationSender());

    }
}
