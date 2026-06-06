package com.lesson.my_exercises.proxy2;

public class VideoPlayerProxy implements VideoPlayer{

    private RealVideoPlayer realVideoPlayer;
    private String subscription;

    public VideoPlayerProxy(String subscription){
        this.subscription = subscription;
    }

    @Override
    public void playVideo(String videoId) {
        if (checkAccess()){
            if(realVideoPlayer == null){
                realVideoPlayer = new RealVideoPlayer();
            }
            realVideoPlayer.playVideo(videoId);
        } else {
            System.out.println("Access denied.");
        }
    }

    private boolean checkAccess(){
        if ("PREMIUM".equals(subscription)){
            return true;
        }
        else if ("FREE".equals(subscription)){
            return false;
        }
        return false;
    }

}
