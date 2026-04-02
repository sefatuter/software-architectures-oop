package com.lesson.my_exercises.prototype;

public class Araba implements Cloneable{
    public String model;

    @Override
    public Araba clone(){
        try {
            return (Araba) super.clone();
        } catch (Exception e){
            return null;
        }
    }

}
