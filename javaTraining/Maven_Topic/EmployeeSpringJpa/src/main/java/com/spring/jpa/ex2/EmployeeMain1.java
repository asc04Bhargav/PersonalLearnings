package com.spring.jpa.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig1.class);
        EmployeeService es = ctx.getBean(EmployeeService.class);

        es.addOrUpdateProduct(new Employee(101,"ravi",120000.00));
    }
}
