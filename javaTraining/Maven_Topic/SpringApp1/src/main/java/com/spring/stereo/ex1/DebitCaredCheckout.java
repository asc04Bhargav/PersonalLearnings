package com.spring.stereo.ex1;

import org.springframework.stereotype.Component;

@Component("DC")
public class DebitCaredCheckout implements Chechout{
    public DebitCaredCheckout() {
        System.out.println("debitcard object created");
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Processed via debit card");
    }
}
