package com.lesson.template;

public abstract class BeverageMaker {
    // Template method defining the overall process

    public void makeBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments(); // baharat
    }
    public abstract void brew();
    public abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water...");
    }
    void pourInCup(){
        System.out.println("Pouring into cup.");
    }

}
