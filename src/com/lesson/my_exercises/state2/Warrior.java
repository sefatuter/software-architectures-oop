package com.lesson.my_exercises.state2;

public class Warrior {
    private CharacterState currentState;

    public Warrior(){
        this.currentState = new NormalState();
    }

    void setState(CharacterState state){
        this.currentState = state;
    }

    void move(){
        currentState.move(this);
    }

    void attack(){
        currentState.attack(this);
    }
}
