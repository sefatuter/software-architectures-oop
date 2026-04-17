package com.lesson.my_exercises.adapter2;

public class Main {
    public static void main(String[] args) {

        OldMonitor oldMonitor = new OldMonitor();

        VGAadapter vgAadapter = new VGAadapter(oldMonitor);

        vgAadapter.connectWithHDMI();

    }
}
