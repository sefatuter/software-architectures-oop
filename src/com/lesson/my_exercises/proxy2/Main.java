package com.lesson.my_exercises.proxy2;

public class Main {
    public static void main(String[] args) {
        VideoPlayer premium = new VideoPlayerProxy("PREMIUM");
        premium.playVideo("12");

        VideoPlayer free = new VideoPlayerProxy("FREE");
        free.playVideo("22");
    }
}
