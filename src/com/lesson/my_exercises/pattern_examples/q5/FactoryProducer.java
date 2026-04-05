package com.lesson.my_exercises.pattern_examples.q5;

public class FactoryProducer {
    public static AbstractFactory getFactory(String OS){
        if (OS.equals("Mac")){
            return new MacFactory();
        }
        else if(OS.equals("Windows")){
            return new WinFactory();
        }
        return null;
    }
}
