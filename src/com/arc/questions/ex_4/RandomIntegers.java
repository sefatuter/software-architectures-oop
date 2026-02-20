package com.arc.questions.ex_4;

import java.util.Random;

public class RandomIntegers {

    public static void main(String[] args) {

        Random rand = new Random();
        int face;

        for (int i = 1; i <= 20; i++) {

            face = rand.nextInt(6) + 1;

            System.out.printf("%d ", face);

            if (i % 5 == 0) {
                System.out.println();
            }

        }


    }
}