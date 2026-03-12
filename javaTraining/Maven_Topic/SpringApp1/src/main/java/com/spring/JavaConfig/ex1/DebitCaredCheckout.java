package com.spring.JavaConfig.ex1;

import org.springframework.stereotype.Component;

public class DebitCaredCheckout implements Chechout {
    public DebitCaredCheckout() {
        System.out.println("debitcard object created");
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Processed via debit card");
    }
}
