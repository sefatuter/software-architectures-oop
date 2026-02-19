package com.arc.oop.inheritance.model;

public class Animal { // Super Class /
    public Long id;
    public String animalName;
    public int age;
    private String color;
    protected int numberOfFeet;

    public void writeName(String animalName) {
        this.animalName = animalName;
        System.out.println("Animal name is: " + this.animalName);
    }

    public void giveVoice() {
        System.out.println("Voicing Animal ....");
    }
}