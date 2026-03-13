package com.lesson.functions;

public class Truck implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Kamyon ile karayolundan teslimat yapıldı.");
    }
}