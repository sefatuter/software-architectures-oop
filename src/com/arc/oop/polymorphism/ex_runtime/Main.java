package com.arc.oop.polymorphism.ex_runtime;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Polmorphic Reference: Parent/Interface type = Child object
        INotification myNotify = new EmailNotification();
        myNotify.send("Hello World"); // Logic works with Email

        // We can swap the object easily
        myNotify = new SmsNotification();
        myNotify.send("Hello World"); // The SAME variable now sends an SMS

        System.out.println("--- Processing a Queue ---");

        // The true power: Managing a list of different objects under one type
        List<INotification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification());
        notifications.add(new SmsNotification());
        notifications.add(new PushNotification());

        for (INotification n : notifications) {
            // We don't know what 'n' is exactly, but we know it can 'send()'
            n.send("General Alert!");
        }
    }
}
