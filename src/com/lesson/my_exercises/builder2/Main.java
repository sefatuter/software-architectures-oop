package com.lesson.my_exercises.builder2;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza.Builder()
                                .setDough("Normal")
                                .setToppings("Mixed")
                                .build();

    }
}
