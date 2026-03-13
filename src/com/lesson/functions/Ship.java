package com.lesson.functions;

public class Ship implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Gemi ile denizyolundan teslimat yapıldı.");
    }
}