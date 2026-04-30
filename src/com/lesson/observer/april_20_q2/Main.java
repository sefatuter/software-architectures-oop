package com.lesson.observer.april_20_q2;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        ConcreteObserverA observerA = new ConcreteObserverA();
        subject.attach(observerA);

        ConcreteObserverB observerB = new ConcreteObserverB();
        subject.attach(observerB);

        subject.someBusinessLogic();
        subject.someBusinessLogic();

        subject.detach(observerB);

        subject.someBusinessLogic();
    }
}