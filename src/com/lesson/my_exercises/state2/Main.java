package com.lesson.my_exercises.state2;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.move();
        warrior.attack();

        warrior.setState(new SuperState());
        warrior.attack();

        warrior.setState(new StunnedState());
        warrior.move();
    }
}
