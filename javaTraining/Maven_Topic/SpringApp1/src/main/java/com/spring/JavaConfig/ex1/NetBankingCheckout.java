package com.spring.JavaConfig.ex1;

import org.springframework.stereotype.Component;

public class NetBankingCheckout implements Chechout {
    public NetBankingCheckout() {
        System.out.println("netBanking Obj Created");
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Processed via net banking");
    }
}
