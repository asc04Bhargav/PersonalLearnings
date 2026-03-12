package com.spring.JavaConfig.ex1;

import org.springframework.stereotype.Component;

public class WatsappNotificationSender implements NotificationSender {
    public WatsappNotificationSender() {
        System.out.println("watsapp notification Object created");
    }

    @Override
    public void sendNotification(String msg) {
        System.out.println("Watsapp Notification :"+ msg);
    }
}
