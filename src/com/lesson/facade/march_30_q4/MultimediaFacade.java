package com.lesson.facade.march_30_q4;

public class MultimediaFacade {
    private VideoPlayer _videoPlayer;
    private AudioPlayer _audioPlayer;
    private Projector _projector;

    public MultimediaFacade(VideoPlayer videoPlayer, AudioPlayer audioPlayer, Projector projector){
        _videoPlayer = videoPlayer;
        _audioPlayer = audioPlayer;
        _projector = projector;
    }

    public void Play(){
        _videoPlayer.play();
        _audioPlayer.play();
        _projector.TurnOn();
    }

    public void Pause(){
        _videoPlayer.pause();
        _audioPlayer.pause();
    }
    public void Stop(){
        _videoPlayer.stop();
        _audioPlayer.stop();
        _projector.TurnOff();
    }
}
