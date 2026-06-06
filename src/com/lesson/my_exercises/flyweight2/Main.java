package com.lesson.my_exercises.flyweight2;

public class Main {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCarType("Otomobil", "Tesla", "Bordo", 200);
        car1.create(10,10,100);

        Car car2 = CarFactory.getCarType("Otomobil", "Tesla", "Bordo",200);
        car2.create(11,10,50);

        Car car3 = CarFactory.getCarType("Otomobil", "Honda", "Bordo",200);
        car2.create(11,10,50);
    }
}
