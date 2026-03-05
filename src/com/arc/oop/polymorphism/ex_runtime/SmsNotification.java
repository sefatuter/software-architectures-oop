package com.arc.oop.polymorphism.ex_runtime;

public class SmsNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

