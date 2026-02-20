package com.arc.start.arrays;

import java.util.Arrays;

public class Main2D {
    public static void main(String[] args) {

        // Defining two dimensional array
        //      int[][] b = {{1,2}, {3,5}};

//        System.out.println(b[1][1]);

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        outputArray(array1);


        // So we need to create object from main and use outputArrayNon

        Main2D main = new Main2D();
        main.outputArrayNon(array1); // bu yapılmazsa hafızada olmayan bir fonksiyonu çağırır. Hafızada bir yer ayır ve daha sonra çağır


    }

    public static void outputArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }

    // Without static

    public  void outputArrayNon(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }


    }


    public void foreach(){

        //for (type variableName : arrayName) {
        // code block to be executed
        //}

        int[] studentGrades = new int[5];
        int[][] grade = new int[5][5];

        for( int i = 0; i < studentGrades.length ; i ++) {
            studentGrades = grade[i];
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}


