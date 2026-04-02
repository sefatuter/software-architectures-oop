package com.lesson.my_exercises.bridge;

public class Radio implements Device{
    @Override
    public void turnOn() {
        System.out.println("Radio Turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio Turned off.");
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
