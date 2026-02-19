package com.arc.oop.inheritance.model;

public class Chicken extends Animal {
    @Override
    public void giveVoice() {
        super.giveVoice();  // Using super also
        System.out.println("Voicing chicken.");
    }
}
