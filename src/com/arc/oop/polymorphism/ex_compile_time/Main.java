package com.arc.oop.polymorphism.ex_compile_time;

public class Main {
    public static void main(String[] args) {
        // Polymorphism allows objects of different classes to be treated as objects of a common superclass,
        // enabling code flexibility, reusability, and maintainability.
        com.arc.oop.polymorphism.ex_compile_time.Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));         // Calls int version
        System.out.println(calc.add(10, 20, 30));     // Calls int version with 3 parameters
        System.out.println(calc.add(5.5, 7.5));       // Calls double version
    }
}
