package com.lesson.my_exercises.flyweight;

public class TreeType implements Tree{ // flyweight sınıfı
    private final String name;
    private final String color;

    public TreeType(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Tree placed at " + x + ", " + y);
    }
}
