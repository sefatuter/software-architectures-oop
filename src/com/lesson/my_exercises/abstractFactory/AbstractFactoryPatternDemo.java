package com.lesson.my_exercises.abstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        IShape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
    }
}
