package com.lesson.my_exercises.state2;

public class StunnedState implements CharacterState{

    @Override
    public void move(Warrior warrior) {
        System.out.println("Trying to move in stunned state.");
        warrior.setState(new NormalState());
    }

    @Override
    public void attack(Warrior warrior) {
        System.out.println("Can't attack stunned!");
    }
}
