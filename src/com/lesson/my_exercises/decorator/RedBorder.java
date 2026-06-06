package com.lesson.my_exercises.decorator;

public class RedBorder extends ShapeDecorator {

    public RedBorder(Shape wrappee){
        super(wrappee);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Red border added.");
    }
}
