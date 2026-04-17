package com.lesson.decorator.april_13_q3;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape); // FIX
    }

    @Override
    public void draw() {
        decoratedShape.draw(); // FIX
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) { // FIX
        System.out.println("Border color red.");
    }
}