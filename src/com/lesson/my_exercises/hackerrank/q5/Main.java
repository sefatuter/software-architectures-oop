package com.lesson.my_exercises.hackerrank.q5;

// Sınav soru formatı
// Lily sayılarla oynamayı seven biridir. Lily sayıların tersiyle
// kendisi ile arasındaki farkı bulan bir oyun yazmıştır.
// Örneğin verilen sayı 12 olsun tersi 21 ve mutlak fark değeride
// 9 olur. Aynı şekilde 120 sayısının tersi 21 aralarındaki fark ise
// 99 olur. lily bu oyunu geliştirerek bulunan farkın verilen farklı bir
// tamsayıya (k) tam bölünüp bölünmemesine göre hangi farkın sinemaya gitmeye karar vermek istemektedir
// Sonuç olarak eğer fark verilen tamsayıya bölünüyorsa sinemaya gidebilir bölünmüyotsa
// sinemaya gidemez yazacaktır

// yazılacak method input olarak
// i -> başlangıç gün değeri
// j -> bitiş değeri
// k -> bölen
// i  - j aralığındaki günlerden  lil'nin sinemaya gidebileceği günleri gösteren fonskyionu yazınız.


public class Main {
    public static void main(String[] args) {
        // 50 60 arası, k = verdi tersiyle kendisi arasındaki farkı
        System.out.println(beautifulDays(20,23,6));

    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;

        while(i <= j){
            double daydiff = Math.abs(i - getReverse(i));
            double result = daydiff / k;
            if(result % 1 == 0){
                count++;
            }
            i++;
        }
        return count;
    }

    public static int getReverse(int num){
        int digit;
        int reversed = 0;

        while(num > 0){
            digit = num % 10;
            reversed *= 10;
            reversed += digit;
            num = num / 10;
        }
        return reversed;
    }


}
