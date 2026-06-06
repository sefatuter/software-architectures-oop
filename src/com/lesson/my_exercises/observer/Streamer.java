package com.lesson.my_exercises.observer;

import java.util.ArrayList;
import java.util.List;

public class Streamer implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            o.update("New video uploaded.");
        }
    }

    public void newVideoUpload() {
        System.out.println("Video: ....");
        notifyObservers();
    }
}
