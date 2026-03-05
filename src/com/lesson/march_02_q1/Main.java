package com.lesson.march_02_q1;

/*
Veirlen dizide en büyük 2 sayıyı dönen metod nedir?
 */


public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,6,8,4,5,7};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++ ) {
            int current = arr[i];

            // 1. Durum: Yeni şampiyon
            if(firstMax < current){
                secondMax = firstMax;
                firstMax = current;
            } else if (current > secondMax && current < firstMax) {
                secondMax = current;
            }
        }
    }
}
