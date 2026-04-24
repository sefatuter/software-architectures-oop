package com.lesson.observer.april_20_q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject implements ISubject {

    public int state; // FIX

    private List<IObserver> _observers = new ArrayList<>(); // FIX

    @Override
    public void attach(IObserver observer) {
        _observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        _observers.remove(observer);
    }

    @Override
    public void Notify() {
        System.out.println("Subject: Notifying observers....");
        for (IObserver observer : _observers) { // FIX
            observer.update(this);
        }
    }

    @Override
    public void SomeBusinessLogic() {
        System.out.println("\nSubject: I'm doing something important...");
        this.state = new Random().nextInt(10); // FIX

        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Subject: My state has changed to: " + this.state); // FIX
        Notify();
    }
}