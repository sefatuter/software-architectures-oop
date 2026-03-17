package com.lesson.march_16_q2;

public class GameFactory {

    public Oyun factoryMethod(Oyunlar oyunTipi){
        Oyun oyun = null;
        switch (oyunTipi){
            case Oyunlar.Atari:
                oyun = new Atari();
                break;
            case Oyunlar.Pc:
                oyun = new Pc();
                break;
            case Oyunlar.Ps:
                oyun = new Ps();
                break;

        }
        return oyun;
    }
}
