package com.arc.questions.ex_7;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 5, 8, 7, 6, 5, 2, 1, 9};

        for (int i = 0; i < array.length - 1; i++) {
            // Minimum elemanı bul
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Bulunan minimum elemanı yer değiştir
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        // Sıralı diziyi yazdır
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
