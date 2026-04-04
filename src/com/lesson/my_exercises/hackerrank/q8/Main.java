package com.lesson.my_exercises.hackerrank.q8;

/*
https://www.hackerrank.com/challenges/mini-max-sum/problem

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Example
arp = [1,3,5,7,91
The minimum sum is 1 + 3+5 + 7 = 16 and the maximum sum is 3 + 5 + 7 + 9 = 24. The function prints
16 24
Function Description
Complete the miniMax Sum function with the following parameters):
• arr[5]: an array of 5 integers
Print
Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.No value should be returned.
Note For some languages, like C, C++, and Java, the sums may require that you use a long integer due to their size.
Input Format
A single line of five space-separated integers.
Constraints
1 ≤ arr (i] ≤ 10°
Sample Input
12 345
Sample Output
10
14
Explanation
The numbers are 1, 2, 3, 4, and 5. Calculate the following sums using four of the five integers:
1. Sum everything except 1, the sum is 2 + 3 + 4 + 5 = 14.
2. Sum everything except 2, the sum is 1 + 3 + 4 + 5 = 13.
3. Sum everything except 3, the sum is 1 + 2 + 4 + 5 = 12.
4. Sum everything except 4, the sum is 1 + 2 + 3 + 5 = 11.
5. Sum everything except 5, the sum is 1 + 2 + 3 + 4 = 10
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        miniMaxSum(arr);
    }
    public static void miniMaxSum(List<Integer> arr){
        // Write your code here
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long tmp;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            tmp = sum;
            tmp -= arr.get(i);
            if(tmp > max){ max = tmp; }
            if(tmp < min){ min = tmp; }
        }
        System.out.println(min + " " + max);
    }
}
