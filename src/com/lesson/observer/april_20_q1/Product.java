package com.lesson.observer.april_20_q1;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<Observer> _observers = new ArrayList<>(); // FIX

    public void Attach(Observer observer){
        _observers.add(observer);
    }

    public void detach(Observer observer){
        _observers.remove(observer);
    }

    public void Notify(){
        for (Observer o : _observers) { // daha temiz
            o.update("Stock changed!"); // FIX
        }
    }

    public void changeStock(){
        // stock change process
        this.Notify();
    }
}