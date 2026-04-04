package com.lesson.my_exercises.hackerrank.q1;

// Verilen dizide en büyük 2 sayıyı dönen metod nedir?

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{3,6,8,4,5,7};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (firstMax < current){
                secondMax = firstMax;
                firstMax = current;
            } else if (secondMax < current && firstMax > current){
                secondMax = current;
            }
        }

        System.out.println(firstMax);
        System.out.println(secondMax);
    }
}
