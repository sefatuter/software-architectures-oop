package com.arc.start.iterations;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Find Prime Number
        System.out.print("Enter number to find if its prime or not: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println("It's Not Prime Number");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("It's Prime Number");
        }


        // Foreach loop usage

        String[] names = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"};

        for (String name : names) {
            System.out.print(name + " ");
        } // take one by one in names to assign name variable

    }
}