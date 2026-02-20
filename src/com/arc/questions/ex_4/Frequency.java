package com.arc.questions.ex_4;

import java.util.Random;

public class Frequency {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] frequency = new int[13]; // Possible sums range from 2 to 12

        for (int roll = 1; roll <= 60; roll++) {
            int die1 = 1 + rand.nextInt(6); // Generates a number between 1 and 6
            int die2 = 1 + rand.nextInt(6); // Generates a second number between 1 and 6
            int sum = die1 + die2; // Sum of two dice
            ++frequency[sum]; // Increment the count for this sum
        }

        System.out.println("Sum of Two Dice Frequencies:");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.println("Sum: " + sum + ", frequency: " + frequency[sum]);
        }
    }
}
