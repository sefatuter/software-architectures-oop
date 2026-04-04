package com.lesson.my_exercises.hackerrank.q6;

/*
You are in charge of the cake for a child's birthday. It will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles. Your task is to count how many candles are the tallest.

Example

candles = [4,4,1,3]

The tallest candles are 4 units high. There are 2 candles with this height, so the function should return 2.

Function Description

Complete the function birthdayCakeCandles with the following parameter(s):
    * int candles[n]: the candle heights

Returns:
    * int: the number of candles that are tallest

Input Format

The first line contains a single integer, n, the size of candles[].
The second line contains n space-separated integers, where each integer i describes the height of candles[i].


Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

Candle heights are [3,2,1,3]. The tallest candles are 3 units, and there are 2 of them.



https://www.hackerrank.com/challenges/birthday-cake-candles/submissions/code/466189174

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>(Arrays.asList(3,2,1,3));

        System.out.println(birthdayCakeCandles(candles));

    }

    public static int birthdayCakeCandles(List<Integer> candles){
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < candles.size(); i++) {
            if (max < candles.get(i)){
                max = candles.get(i);
            }
        }
        for (int i = 0; i < candles.size(); i++) {
            if (max == candles.get(i)){
                count++;
            }
        }

        return count;
    }
}
