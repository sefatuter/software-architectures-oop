package com.arc.oop.inheritance.model;

public class Dog extends Animal{ // Taking Animal class inherit // Sub Class

    //    numberOfFeet = 10; // Can't accessible because it's not inside of method
    public void test() {
        numberOfFeet = 10; // can accessible because protected. And it can be accessible only in method or constructor, not in main class
//        color = "test"   // not accessible because private
    }
    public Dog() { // Constructor
        numberOfFeet = 15;
    }

    @Override
    public void giveVoice() {
        System.out.println("Voicing howf");
    }
}
