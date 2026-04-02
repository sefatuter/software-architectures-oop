package com.lesson.my_exercises.adapter;

public class Main {
    public static void main(String[] args) {
        IyzicoApi api = new IyzicoApi();

        PaymentProcessor paymentSystem = new IyzicoAdapter(api);

        paymentSystem.pay(100);
    }

}
