package com.lesson.my_exercises.composite2;

public class Junior extends Dev{

    Junior(String name){
        super(name);
    }

    @Override
    void print() {
        System.out.println(" - Junior" + name);
    }
}
