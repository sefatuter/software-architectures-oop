package com.lesson.my_exercises.adapter;

public class IyzicoAdapter implements PaymentProcessor{

    private IyzicoApi iyzicoApi;

    public IyzicoAdapter(IyzicoApi iyzicoApi) {
        this.iyzicoApi = iyzicoApi;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Adapter works now, pay() is converting to makePayment()..");
        iyzicoApi.makePayment(amount);
    }
}
