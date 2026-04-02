package com.lesson.my_exercises.bridge;

// yöneten ana nesne olur.
public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    public abstract void buttonPressed();
}
