package com.lesson.my_exercises.observer2;

import java.util.ArrayList;
import java.util.List;

public class Streamer implements StockSubject{
    private List<StockObserver> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public Streamer(String stockName, double price){
        this.stockName = stockName;
        this.price = price;
    }

    @Override
    public void register(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(StockObserver observer: observers){
            observer.update(stockName, price);
        }
    }

    public void setPrice(double price){
        this.price = price;
        notifyObservers();
        System.out.println("Price updated to " + price);
    }
}
