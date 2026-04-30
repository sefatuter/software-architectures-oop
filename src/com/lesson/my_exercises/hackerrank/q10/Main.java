package com.lesson.my_exercises.hackerrank.q10;

// Bir sayının palindrome olup/olm. bulan kod (12321, 121)

public class Main {
    public static void main(String[] args) {
        int num = 121;

        //tersini al, kendisiyle karşılaştır.
        if (getReverse(num) == num){
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }

    }

    public static int getReverse(int num){

        int tmp = 0;

        while (num > 0){
            tmp *= 10;
            int digit = num % 10;
            tmp += digit;
            num /= 10;
        }

        return tmp;
    }
}
