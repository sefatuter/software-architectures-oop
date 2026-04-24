package com.lesson.factory.march_16_q1;

public class Main {
    public static void main(String[] args) {
// Factory pattern is creational pattern
        // aynı interfaceden türeyen class larda kullanılır
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        shape1.draw();

        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
    }
}
