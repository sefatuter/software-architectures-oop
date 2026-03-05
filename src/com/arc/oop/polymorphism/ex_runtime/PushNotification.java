package com.arc.oop.polymorphism.ex_runtime;

public class PushNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification to Mobile App: " + message);
    }
}
