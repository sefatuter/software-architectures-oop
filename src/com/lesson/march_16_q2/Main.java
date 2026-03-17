package com.lesson.march_16_q2;

public class Main {
    public static void main(String[] args) {
        GameFactory factory = new GameFactory();

        Oyun oyun1 = factory.factoryMethod(Oyunlar.Atari);
        oyun1.platform();

        Oyun oyun2 = factory.factoryMethod(Oyunlar.Ps);
        oyun2.platform();
    }
}
