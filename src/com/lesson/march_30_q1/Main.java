package com.lesson.march_30_q1;

// Bridge Design Pattern

public class Main {
    public static void main(String[] args) {
        var circle = new Circle(new Red());
        System.out.println(circle.toString());

        var square = new Square(new Blue());
        System.out.println(square.toString());

        var triangle = new Triangle(new Green());
        System.out.println(triangle.toString());
    }
}
