package com.lesson.my_exercises.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new ApplePay());
        processor.executePayment(1000);

        processor.setStrategy(new PayPal());
        processor.executePayment(102);
    }
}
