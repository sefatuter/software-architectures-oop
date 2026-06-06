package com.lesson.my_exercises.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {

        Employee developer = new Developer();
        Employee leader = new Leader();

        developer.setNext(leader);

        developer.withdraw(10001);
    }
}
