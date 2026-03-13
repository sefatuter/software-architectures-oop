package com.lesson.march_09_q1;


public class Main {
    public static void main(String[] args) {

        /*
        verilen sayının basamaklarının kaç tanesi tam bölen ise o kadar sayısı return edin
         */
        int num = 500;
        int digit;
        int count = 0;
        int tmp = num;
        for(int i = 0; i < num; i++) {
            digit = num % 10;
            if(num % digit == 0) {
                count++;
            }
            num = num / 10;
        }
        for (int j = 0; j < count; j++){
            System.out.print(tmp);
            System.out.print(" ");
        }
    }

    /*
    Armstrong sayısı

    Basamakların küpleri toplamı kendisi olan sayıya denir.


    int numb = 371;
    int counter = 0;

    while(numb > 0){
        counter[i] = num % 10;
        num = num / 10;
        total = (counter[i] * counter[i] * counter[i]) + total;
    } if(num == total) {
        return num;
    }

    */

}
