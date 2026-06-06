package com.lesson.my_exercises.state2;

public class SuperState implements CharacterState{
    @Override
    public void move(Warrior warrior) {
        System.out.println("Moving in super state.");
    }

    @Override
    public void attack(Warrior warrior) {
        System.out.println("Attacked in super state!");
        warrior.setState(new NormalState());
    }
}
