package com.lesson.my_exercises.state;

public class TVOffState implements State{
    @Override
    public void pressPowerButton(TVContext tv) {
        System.out.println("TV is opening...");
        tv.setCurrentState(new TVOnState());
    }
}
