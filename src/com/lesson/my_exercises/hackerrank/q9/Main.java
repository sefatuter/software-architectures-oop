package com.lesson.my_exercises.hackerrank.q9;

// Verilen tamsayının kendisini oluşturan her bir basamağına bölünüp bölünmediğini belirtiniz.
// Bölündüğü basamakların sayısını return ediniz.

public class Main {
    public static void main(String[] args) {
        int num = 123;
        int count = 0;
        int tmp = num;

        while(num > 0) {

            int digit =  num % 10;
            if (tmp % digit == 0){
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);

    }
}
