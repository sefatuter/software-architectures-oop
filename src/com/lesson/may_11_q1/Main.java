package com.lesson.may_11_q1;

/*
12 Saatlik formatta (AM/PM) verilen bir zamanı 24 saatlik formata dönnüştüren kodu yazınız.

örn input: 07:05:45PM , output: 19:05:45
 */

public class Main {
    public static void main(String[] args) {
        String input = "07:05:45PM";

        String hour = input.substring(0,2);
        String minute_second = input.substring(2,8);

        String period = input.substring(8,10);
        String result = "";

        int tmpHour = Integer.parseInt(hour);

        if(period.equals("PM")){
            if (tmpHour == 12){
                result += hour+minute_second;
            } else {
                tmpHour+=12;
                hour = String.format("%02d", tmpHour);
                result = hour + minute_second;
            }
        } else {
            if (tmpHour == 12){
                tmpHour-=12;
                hour = String.format("%02d", tmpHour);
                result = hour + minute_second;
            } else {
                result = hour + minute_second;
            }
        }

        System.out.println(result);
    }

}
