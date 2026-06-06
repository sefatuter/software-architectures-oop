package com.lesson.my_exercises.proxy2;

public class RealVideoPlayer implements VideoPlayer{
    @Override
    public void playVideo(String videoId) {
        System.out.println("Id: " + videoId + ", Video is playing");
    }
}
