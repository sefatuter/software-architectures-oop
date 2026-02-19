package com.arc.start.methods;

import java.util.Scanner;

public class Test {
    public static void printStars(int number) {
        // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the command
        // System.out.println("");
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int number) {
        for (int i = 1; i <= number; i++) {
            printStars(number);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle2(int size) {
        for (int j = 1; j <= size; j++) {
            printSpaces(j);
            for (int i = 1; i <= size; i++) {
                printStars(i);
            }
        }
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();
        printSquare(4);
        System.out.println();

        printRectangle(17,3);
        System.out.println();

        printTriangle(4);
        System.out.println();

        printTriangle2(4);


        Scanner x = new Scanner(System.in);
        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else if (y >= 1000 && y % 25 == 0) {
            System.out.println("Gets a gift card!");

        } else {
            System.out.println("Gets nothing.");
        }

    }
}
