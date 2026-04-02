package com.lesson.my_exercises.singleton;

public class Main {
    public static void main(String[] args) {

        Logger nesne1 = Logger.createSingletonInstance();
        Logger nesne2 = Logger.createSingletonInstance();
        Logger nesne3 = Logger.createSingletonInstance();
    }
}
