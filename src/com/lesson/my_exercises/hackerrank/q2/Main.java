package com.lesson.my_exercises.hackerrank.q2;

/*
Verilen sayının mükemmel sayı olup olmadığını kontrol edin.
(Kendisi hariç bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir)
 */

public class Main {
    public static void main(String[] args) {

        int num = 28;
        int sum = 0;

        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0){
                sum += i;
            }
        }
        if (num==sum){
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not perfect number.");
        }


    }
}
