package com.arc.threads.basics;

public class CounterTwo implements Runnable {
    private String name;

    public CounterTwo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " started ccounter.");

        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + " : " + i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}