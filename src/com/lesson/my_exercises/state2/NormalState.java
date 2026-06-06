package com.lesson.my_exercises.state2;

public class NormalState implements CharacterState{
    @Override
    public void attack(Warrior warrior) {
        System.out.println("Attacking in normal state.");
    }

    @Override
    public void move(Warrior warrior) {
        System.out.println("Moving in normal state.");
    }
}
