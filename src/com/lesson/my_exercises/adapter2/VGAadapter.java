package com.lesson.my_exercises.adapter2;

public class VGAadapter implements HDMI{
    private OldMonitor oldMonitor;

    public VGAadapter(OldMonitor oldMonitor){
        this.oldMonitor = oldMonitor;
    }

    @Override
    public void connectWithHDMI() {
        oldMonitor.connectWithVGA();
    }
}
