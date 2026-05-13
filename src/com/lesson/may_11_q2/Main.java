package com.lesson.may_11_q2;

/*

iki kanguru bir sayı doğrusu üzerinde zıplıyor
Birinci kanguru x1 noktasından başlayıp her zoplayışta v1 mesafe katediyor.
ikinci kanguru x2 noktasından başlayıp v2 mesafe katediyor. Aynı anda zıplayan bu iki
kangurunun aynı noktada buluşup buluşmayacağını bulun.

 */

public class Main {
    public static void main(String[] args) {

    }

    public String kangaroo(int x1, int v1, int x2, int v2){

        if(x1 < x2 && v2 > v1 || x2 < x1 && v1 > v2){
            return "False";
        }
        if(x1 == x2){
            return "True";
        }
        if((x2-x1) % (v1-v2) == 0){
            return "True";
        }
        return "False";
    }
}
