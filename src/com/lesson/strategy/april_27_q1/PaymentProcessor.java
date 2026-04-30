package com.lesson.strategy.april_27_q1;

// hatalı open-closed'a aykırı prensip bu:

public class PaymentProcessor {
    private PaymentType paymentType;
    public void processPayment(double amount){
        if (paymentType == PaymentType.CREDIT_CARD){
            System.out.println("CREDIT_CARD payment");
        } else if (paymentType == PaymentType.DEBIT_CARD) {
            System.out.println("DEBIT_CARD payment");
        } else if (paymentType == PaymentType.PAYPAL) {
            System.out.println("PAYPAL payment");
        } else {
            throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}
