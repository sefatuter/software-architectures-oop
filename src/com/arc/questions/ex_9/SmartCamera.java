package com.arc.questions.ex_9;

public class SmartCamera extends BaseDevice{
    public SmartCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Smart Camera Turned On.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Camera Turned Off.");
    }
}
