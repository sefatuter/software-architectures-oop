package com.lesson.strategy.april_27_q2;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaypalPaymentStrategy());
        paymentProcessor.processPayment(1000);
    }
}
