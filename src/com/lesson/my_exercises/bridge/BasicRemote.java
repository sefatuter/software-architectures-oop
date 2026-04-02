package com.lesson.my_exercises.bridge;

public class BasicRemote extends RemoteControl{

    public BasicRemote(Device device){
        super(device); // üst sınıfın constructor'unu çalıştır demek. yani RemoteControl'u
    }

    @Override
    public void buttonPressed() {
        System.out.println("Basic Button Pressed.");
        device.turnOn();
    }
}
