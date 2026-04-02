package com.lesson.my_exercises.bridge;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV Turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Turned off.");
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
