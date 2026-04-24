package com.lesson.abstractfactory.march16_q4;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equals("RECTANGLE")){
            return new Rectangle();
        }
        else if (shapeType.equals("SQUARE")){
            return new Square();
        }
        return null;
    }
}
