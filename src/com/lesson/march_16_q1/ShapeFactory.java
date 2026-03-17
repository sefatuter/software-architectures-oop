package com.lesson.march_16_q1;

public class ShapeFactory {
    public Shape getShape(String shapeType){ // Shape tarzında returnlamalı.
        if(shapeType.equals("Circle")){
            return new Circle();
        }
        else if (shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        else if (shapeType.equals("Square")){
            return new Square();
        }
        return null;
    }
}
