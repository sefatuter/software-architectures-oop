package com.lesson.observer.april_20_q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject implements ISubject {
    private int state;
    private final List<IObserver> observers = new ArrayList<>();
    private final Random random = new Random();

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Subject: Notifying observers...");
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void someBusinessLogic() {
        System.out.println("\nSubject: I'm doing something important...");

        this.state = random.nextInt(10);

        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Subject: My state has changed to: " + this.state);

        notifyObservers();
    }

    @Override
    public int getState() {
        return state;
    }
}