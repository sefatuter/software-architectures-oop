package com.lesson.observer.april_20_q2;

public class ConcreteObserverB implements IObserver {

    @Override
    public void update(ISubject subject) {
        Subject s = (Subject) subject; // FIX

        if (s.state == 0 || s.state >= 2) {
            System.out.println("ConcreteObserverB: reacted to the event.");
        }
    }
}