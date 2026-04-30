package com.lesson.state.april_27_q3;

public class Context {
    private State state;
    public Context(){
        state = null;
    }
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
