package com.arc.questions.q_three;

import java.util.Scanner;

public class Main {
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int x = sc.nextInt(); // Corrected the input assignment
        System.out.printf("Square: %d%n", square(x)); // Corrected the output to use printf
    }
}
