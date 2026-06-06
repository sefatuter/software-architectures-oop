package com.lesson.my_exercises.strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid : " + amount + " using Credit Card");
    }
}
