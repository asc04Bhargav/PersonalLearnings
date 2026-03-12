package com.spring.JavaConfig.ex1;

import org.springframework.stereotype.Component;

public class EmailNotificationSender implements NotificationSender {

    public EmailNotificationSender() {
        System.out.println("email notification object created");
    }

    @Override
    public void sendNotification(String msg) {
        System.out.println("Email notification :" + msg);
    }
}
