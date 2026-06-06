package com.lesson.my_exercises.flyweight;

public class Main {
    public static void main(String[] args) {
        Tree pine1 = new TreeType("Pine", "Green");
        pine1.draw(10,10);

        Tree pine2 = new TreeType("Pine", "Green");
        pine2.draw(15,12);
    }
}
