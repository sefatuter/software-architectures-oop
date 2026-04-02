package com.lesson.my_exercises.bridge;

public class AdvancedRemote extends RemoteControl{

    public AdvancedRemote(Device device){
        super(device);
    }

    @Override
    public void buttonPressed() {
        System.out.println("Advanced Remote button pressed.");
        device.turnOn();
    }

    public void mute() {
        System.out.println("Advanced Remote muted.");
        device.setVolume(0);
    }
}
