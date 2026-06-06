package com.lesson.my_exercises.observer2;

public class TradingObserver implements StockObserver{
    @Override
    public void update(String stockName, double price) {
        if (price < 100){
            System.out.println("[BOT] Satın alma emri verildi.");
        }
    }
}
