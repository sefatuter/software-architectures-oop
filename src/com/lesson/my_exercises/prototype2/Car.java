package com.lesson.my_exercises.prototype2;

public class Car implements Cloneable{
    public String model;

    public Car(String model){
        this.model = model;
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        }catch (Exception e){
            return null;
        }
    }
}
