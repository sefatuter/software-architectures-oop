package com.lesson.command;

public class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is turned off.");
    }

    public void adjustVolume(){
        System.out.println("Volume adjusted.");
    }
}
