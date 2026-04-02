package com.lesson.my_exercises.factory;

public class ShapeFactory {
    // uretim bandi
    public IShape createShape(String type){
        if (type.equals("Dikdortgen")){
            return new Rectangle();
        } else if (type.equals("Ucgen")) {
            return new Triangle();
        }
        return null;
    }
}
