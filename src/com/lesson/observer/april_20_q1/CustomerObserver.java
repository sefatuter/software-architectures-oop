package com.lesson.observer.april_20_q1;

public class CustomerObserver extends Observer {

    private String nesne;

    public CustomerObserver(String nesne){
        this.nesne = nesne;
    }

    @Override
    public void update(String message){
        System.out.println(nesne + " received: " + message);
    }
}