package com.lesson.observer.april_20_q2;

public class ConcreteObserverA implements IObserver {

    @Override
    public void update(ISubject subject) {
        Subject s = (Subject) subject; // FIX

        if (s.state < 3) {
            System.out.println("ConcreteObserverA: reacted to the event.");
        }
    }
}