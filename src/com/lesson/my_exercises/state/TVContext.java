package com.lesson.my_exercises.state;

public class TVContext {
    private State currentState;

    public TVContext(){
        this.currentState = new TVOffState();
    }
    public void setCurrentState(State state){
        this.currentState = state;
    }

    public void pressPowerButton() {
        currentState.pressPowerButton(this);
    }
}
