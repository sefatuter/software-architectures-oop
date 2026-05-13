package com.lesson.may_11_q3;

/*

Bir tamsayı dizisi ve bir "k" sayısı veriliyor. öyle bir (i,j) çiftleri bulun ki i<j olsun
ve (ar[i] + ar[j]) toplamı k'ya tam bölünsün. bu şekilde kaç çift vardır?

2 <= n <= 100 , 1 <= k <= 100, 1<= ar[i] <= 100

ör: input n=6, k=3, ar=[1,3,2,6,1,2], output = 5

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
//            1,3,2,6,1,2

        int count = 0;
        int k = 3;

        for (int i = 0; i < ar.size(); i++) {
            int firstNum = ar.get(i);
            for (int j = 1; j < ar.size(); j++) {
                int secNum = ar.get(j);

                if(i<j && (ar.get(i) + ar.get(j) % k == 0)){
                    count++;
                }
            }
        }
    }
}
