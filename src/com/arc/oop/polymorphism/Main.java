package com.arc.oop.polymorphism;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism allows objects of different classes to be treated as objects of a common superclass,
        // enabling code flexibility, reusability, and maintainability.
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));         // Calls int version
        System.out.println(calc.add(10, 20, 30));     // Calls int version with 3 parameters
        System.out.println(calc.add(5.5, 7.5));       // Calls double version


    }
}
