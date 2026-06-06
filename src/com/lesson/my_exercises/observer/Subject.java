package com.lesson.my_exercises.observer;

public interface Subject {
    void attach(Observer o);
    void notifyObservers();
}
