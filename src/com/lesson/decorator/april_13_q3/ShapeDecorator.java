package com.lesson.decorator.april_13_q3;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape; // FIX
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}