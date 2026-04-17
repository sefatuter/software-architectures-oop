package com.lesson.proxy.april_13_q1;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("Real subject handling request");
    }
}

