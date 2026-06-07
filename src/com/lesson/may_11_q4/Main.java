package com.lesson.may_11_q4;
/*
İki tamsayı dizisi (A ve B) veriliyor. Öyle x sayıları bulun ki A daki tüm elemanlar x'in
böleni olsun ve x, B'deki tüm elemanların böleni olsun. Bu şartı sağlayan kaç x sayısı vardır?

1 <= a[i], b[i] <= 100

input: A=(2,4), B=(16,32,96) - output: 3 (4,8,16)

x % a[i] == 0
b[i] % x == 0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(2,4));
        List<Integer> b = new ArrayList<>(Arrays.asList(16,32,96));
        int result = 0;

        long lcmA = a.get(0);

        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        long gcdB = b.get(0);

        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        for (long x = lcmA; x <= gcdB; x = x + lcmA){ // x, a'dakilerin katları olmak zorunda
            if (gcdB % x == 0) {
                result++;
            }
        }

        System.out.println(result);

        // brute force çözüm
//        for (int i = Collections.min(a); i <= Collections.max(b); i++) { // denenecek sayilar
//            boolean valid = true;
//            for (int j = 0; j < a.size(); j++) {
//                if (i % a.get(j) != 0){
//                    valid = false;
//                    break;
//                }
//            }
//
//            for (int j = 0; j < b.size(); j++) {
//                if(b.get(j) % i != 0){
//                    valid = false;
//                    break;
//                }
//            }
//
//            if (valid){
//                result++;
//            }
//        }
//
//        System.out.println(result);

    }
    public static long gcd(long a, long b){
        while (b != 0){
            long tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }

    public static long lcm(long a, long b){
        return (a * b) / gcd(a,b);
    }
}
