package com.lesson.my_exercises.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape myShape1 = shapeFactory.createShape("Dikdortgen");

        myShape1.draw();
    }
}
