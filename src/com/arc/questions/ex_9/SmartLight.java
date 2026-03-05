package com.arc.questions.ex_9;

public class SmartLight extends BaseDevice{
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Smart Light is Turned On.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light is Turned Off.");
    }
}
