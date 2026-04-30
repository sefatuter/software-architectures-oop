package com.lesson.observer.april_20_q2;

public interface ISubject {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers();
    void someBusinessLogic();
    int getState();
}