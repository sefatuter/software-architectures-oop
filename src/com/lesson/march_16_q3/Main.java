package com.lesson.march_16_q3;

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

import java.util.List;

public class Main {
    // 50 60 arası, k = verdi tersiyle kendisi arasındaki farkı

    public void cinema(){
        int i = 50;
        int j = 60;
        int k = 5;

        for (int m = i; m < j; m++){
            int num1 = m;
            int num2 = getReverse(m);

            if (Math.abs(num1-num2) % k == 0){
                System.out.println("Sinemaya gidebilir");
            }
            else {
                System.out.println("Sinemaya gidemez");
            }

        }
    }

    public int getReverse(int num){

        int reverse = 0;

        while(num > 0) {
            int x = num % 10;
            reverse = reverse * 10 + x;
            num = num / 10;
        }

        return reverse;
    }

}
