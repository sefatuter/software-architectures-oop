package com.lesson.my_exercises.strategy;

public class ApplePay implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid : " + amount + " using Apple Pay");
    }
}
