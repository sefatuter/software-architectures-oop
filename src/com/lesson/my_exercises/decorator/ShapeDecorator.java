package com.lesson.my_exercises.decorator;

abstract class ShapeDecorator implements Shape{
    protected Shape wrappee;

    public ShapeDecorator(Shape wrappee){
        this.wrappee = wrappee;
    }

    @Override
    public void draw() {
        wrappee.draw();
    }
}
