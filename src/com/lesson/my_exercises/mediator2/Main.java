package com.lesson.my_exercises.mediator2;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        MotionSensor sensor = new MotionSensor(hub);
        AlarmSiren siren = new AlarmSiren(hub);
        SecurityCamera camera = new SecurityCamera(hub);

        hub.setSensor(sensor);
        hub.setCamera(camera);
        hub.setSiren(siren);


        sensor.detectMotion();
    }
}
