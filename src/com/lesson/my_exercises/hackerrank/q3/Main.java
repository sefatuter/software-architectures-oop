package com.lesson.my_exercises.hackerrank.q3;

/*
Verilen sayının basamaklarının kaç tanesi tam bölen ise o kadar sayısı return edin
*/

public class Main {
    public static void main(String[] args) {
        int num = 500;
        int count = 0;
        int digit;
        int temp = num;

        while(num > 0) {
            digit = num % 10;
            if (digit != 0 && temp % digit == 0){
                count++;
            }
            num = num / 10;
        }
        for (int j = 0; j < count; j++){
            System.out.print(temp);
            System.out.print(" ");
        }
    }
}
