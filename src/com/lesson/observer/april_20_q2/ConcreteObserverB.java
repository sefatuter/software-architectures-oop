package com.lesson.observer.april_20_q2;

public class ConcreteObserverB implements IObserver {

    @Override
    public void update(ISubject subject) {
        if (subject.getState() == 0 || subject.getState() >= 2) {
            System.out.println("ConcreteObserverB: reacted to the event.");
        }
    }
}