package com.lesson.my_exercises.abstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    public IShape getShape(String type) {
        if (type.equals("RECTANGLE")){
            return new Rectangle();
        }
        else if (type.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
