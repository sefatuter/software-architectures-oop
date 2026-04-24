package com.lesson.factory.march_16_q1;

// factory pattern
public class Rectangle implements Shape {

    @Override
    public void draw() { // implement edilen interface'in fonksiyon tanımları implemente edilmek zorunda
        System.out.println("Rectangle draw method");
    }
}
