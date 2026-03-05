package com.lesson.march_02_q2;

/*
Verilen sayının mükemmel sayı olup olmadığını kontrol edin.
(Kendisi hariç bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir)
 */

public class Main {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;

        for (int i = 1; i <= num/2 ; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        if (sum == num){
            System.out.println("Is perfect number.");
        } else {
            System.out.println("Is not perfect number.");
        }
    }
}
