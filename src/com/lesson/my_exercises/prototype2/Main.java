package com.lesson.my_exercises.prototype2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");

        Car car2 = car1.clone();
        car2.model = "AUDI";

        System.out.println(car1.model);
        System.out.println(car2.model);
    }
}
