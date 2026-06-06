package com.lesson.my_exercises.decorator;

public class Main {

    public static void main(String[] args) {
        Shape redCircle = new RedBorder(new Circle());
        redCircle.draw();
    }
}
