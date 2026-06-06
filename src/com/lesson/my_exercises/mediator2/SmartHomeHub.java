package com.lesson.my_exercises.mediator2;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub implements HomeMediator{

    private MotionSensor sensor;
    private AlarmSiren siren;
    private SecurityCamera camera;

    void setSensor(MotionSensor sensor){ this.sensor = sensor;}
    void setSiren(AlarmSiren siren){ this.siren = siren; }
    void setCamera(SecurityCamera camera){ this.camera = camera; }

    @Override
    public void trigger(Device device, String event) {
        if (device == sensor && "MOTION_DETECTED".equals(event)){
            System.out.println("[Hub] Hub received motion event. Activating other devices...");
            siren.soundAlarm();
            camera.startRecording();
        }
    }
}
