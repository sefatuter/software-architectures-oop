package com.lesson.my_exercises.bridge;

public class Main {
    public static void main(String[] args) {
        // once cihaz uret
        Device myTv = new TV();

        // o cihazı yonetecek controller
        BasicRemote basicRemote = new BasicRemote(myTv);

        basicRemote.buttonPressed();

        AdvancedRemote advancedRemote = new AdvancedRemote(myTv);

        advancedRemote.buttonPressed();
        advancedRemote.mute();

    }
}
