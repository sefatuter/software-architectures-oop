package com.lesson.my_exercises.observer2;

public class MobileAppObserver implements StockObserver{
    @Override
    public void update(String stockName, double price) {
        System.out.println("Stock: " + stockName + ", Price: " + price);
    }
}
