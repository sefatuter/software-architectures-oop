package com.lesson.my_exercises.flyweight2;

public class CarType implements Car{

    private final String carType;
    private final String brand;
    private final String color;
    private final int maxVelocity;

    public CarType(String carType, String brand, String color, int maxVelocity){
        this.carType = carType;
        this.brand = brand;
        this.color = color;
        this.maxVelocity = maxVelocity;
    }

    @Override
    public void create(int x, int y, int v) {
        System.out.println("Car placed at: " + x + ", " + y + "; Max velocity = " + v);
    }
}
