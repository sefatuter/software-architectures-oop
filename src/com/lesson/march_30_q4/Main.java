package com.lesson.march_30_q4;

public class Main {
    public static void main(String[] args) {
        // 1. Karmaşık alt sistemleri önce tek tek hazırlıyoruz
        VideoPlayer videoPlayer = new VideoPlayer();
        AudioPlayer audioPlayer = new AudioPlayer();
        Projector projector = new Projector();

        // 2. Facade, bu parçaları alıp birleştiriyor
        MultimediaFacade facade = new MultimediaFacade(videoPlayer, audioPlayer, projector);

        // 3. Main artık sadece basit arayüzü görüyor
        // "VideoPlayer.play(), AudioPlayer.play(), Projector.TurnOn()..."
        // satırlarıyla uğraşmak yerine tek komut:
        facade.Play();
        facade.Pause();
        facade.Stop();
    }
}
