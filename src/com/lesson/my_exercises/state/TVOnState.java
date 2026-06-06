package com.lesson.my_exercises.state;

public class TVOnState implements State{
    @Override
    public void pressPowerButton(TVContext tv) {
        System.out.println("TV is closing...");
        tv.setCurrentState(new TVOffState());
    }
}
