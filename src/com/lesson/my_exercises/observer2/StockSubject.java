package com.lesson.my_exercises.observer2;

public interface StockSubject {
    void register(StockObserver observer);
    void unregister(StockObserver observer);
    void notifyObservers();
}
