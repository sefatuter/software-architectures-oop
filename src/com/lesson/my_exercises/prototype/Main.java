package com.lesson.my_exercises.prototype;

public class Main {
    public static void main(String[] args) {
        Araba araba1 = new Araba();

        araba1.model = "BMW";

        Araba araba2 = araba1.clone();

        araba2.model = "AUDI";

        System.out.println(araba2.model);
        System.out.println(araba1.model);
    }
}
