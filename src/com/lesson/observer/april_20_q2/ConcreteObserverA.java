package com.lesson.observer.april_20_q2;

public class ConcreteObserverA implements IObserver {

    @Override
    public void update(ISubject subject) {
        if (subject.getState() < 3) {
            System.out.println("ConcreteObserverA: reacted to the event.");
        }
    }
}