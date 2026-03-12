package com.spring.stereo.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("OP")  //this annotation creates object of OrderProcess and register
//this annotation does not perform OR inject dependencies into the object of OrderProcess
public class OrderProcessor {

    @Autowired // this annotation , instructs the container to search for the existence of any object whose class is NotificationSender
//    and if something is there , then inject it into the OrderProcessor object
    @Qualifier("EN")
    private NotificationSender notificationSender;

    @Autowired
    @Qualifier("DC")
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
