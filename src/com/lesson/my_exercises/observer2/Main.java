package com.lesson.my_exercises.observer2;

public class Main {
    public static void main(String[] args) {
        Streamer streamer = new Streamer("NVDA", 250);
        streamer.register(new MobileAppObserver());
        streamer.register(new TradingObserver());

        streamer.setPrice(10);
        streamer.setPrice(200);
    }
}
