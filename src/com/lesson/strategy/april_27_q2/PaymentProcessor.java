package com.lesson.strategy.april_27_q2;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor (PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
