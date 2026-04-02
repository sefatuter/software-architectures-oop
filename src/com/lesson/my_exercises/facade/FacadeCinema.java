package com.lesson.my_exercises.facade;

public class FacadeCinema {
    private Lights lights;
    private TV tv;
    private SoundSystem soundSystem;

    public FacadeCinema(){
        this.lights = new Lights();
        this.tv = new TV();
        this.soundSystem = new SoundSystem();
    }

    public void startCinema(){
        System.out.println("Cinema is starting..");
        lights.closeLights();
        tv.openTv();
        tv.openNetflix();
        soundSystem.openSoundSystem();
        System.out.println("Done");
    }
}
