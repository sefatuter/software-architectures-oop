package com.lesson.my_exercises.hackerrank.q4;

/*
Armstrong sayısı: Basamakların küpleri toplamı kendisi olan sayıya denir.
*/


public class Main {
    public static void main(String[] args) {
        int num = 371;
        int digit;
        int sum = 0;
        int tmp = num;

        while (num > 0){
            digit = num % 10;
            sum = sum + (digit*digit*digit);
            num = num / 10;
        }
        if (sum == tmp){
            System.out.println("is Armstrong number.");
        } else {
            System.out.println("is not Armstrong number.");
        }
    }
}
