package com.lesson.may_11_q1;

/*
12 Saatlik formatta (AM/PM) verilen bir zamanı 24 saatlik formata dönnüştüren kodu yazınız.

örn input: 07:05:45PM , output: 19:05:45
 */

public class Main {
    public static void main(String[] args) {
        String input = "07:05:45PM";

        String hour = input.substring(0,2);
        String minute = input.substring(3,5);
        String second = input.substring(6,8);

        System.out.println(hour + " " + minute + " " + second);

    }
}
