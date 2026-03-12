package com.spring.JavaConfig.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//this annotation does not perform OR inject dependencies into the object of OrderProcess
@Component("OP")
public class OrderProcessor {

    @Autowired
    @Qualifier("wns")
    private NotificationSender notificationSender;

    @Autowired
    @Qualifier("dc")
    private Chechout chechout;

    public void processOrder(){
        chechout.processPayment();
        System.out.println("Inventory update");
        System.out.println("send message to shipping..");
        notificationSender.sendNotification(null);
    }

    public OrderProcessor() {
        System.out.println("OrderProcess Object Created");
    }

    public OrderProcessor(NotificationSender notificationSender, Chechout chechout) {
        this.notificationSender = notificationSender;
        this.chechout = chechout;
    }

    public NotificationSender getNotificationSender() {
        return notificationSender;
    }

    public void setNotificationSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public Chechout getChechout() {
        return chechout;
    }

    public void setChechout(Chechout chechout) {
        this.chechout = chechout;
    }
}
