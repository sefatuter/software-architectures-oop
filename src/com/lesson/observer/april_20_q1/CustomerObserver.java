package com.lesson.observer.april_20_q1;

public class CustomerObserver extends Observer {

    private String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}