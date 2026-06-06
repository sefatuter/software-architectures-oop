package com.lesson.my_exercises.observer;

public class Main {
    public static void main(String[] args) {

        Streamer streamer = new Streamer();
        streamer.attach(new Subscriber("Elon"));

        streamer.newVideoUpload();
    }
}
