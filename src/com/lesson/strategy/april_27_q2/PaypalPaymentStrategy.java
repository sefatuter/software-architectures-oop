package com.lesson.strategy.april_27_q2;

public class PaypalPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment with paypal.");
    }
}
