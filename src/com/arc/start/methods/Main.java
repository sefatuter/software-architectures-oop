package com.arc.start.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // without parameter and no return
        writeName("Ali", 2);
        System.out.println(returnInt());

        greet();
    }

    public static void writeName(String name, int age) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
    }

    public static int returnInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        return sc.nextInt() * 2;
    }
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }
}
