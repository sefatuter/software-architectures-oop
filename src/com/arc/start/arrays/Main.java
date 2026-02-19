package com.arc.start.arrays;

public class Main {
    public static void main(String[] args) {

//        String[] names = new String[5]; // Create Array
        // accepts only data of the type of array defined.
        String[] names = new String[]{"john", "jake", "james", "jake"};
//        names[0] = "John Doe";
//        names[1] = "Jane Doe";
//        names[2] = "James Doe";
//        names[3] = "Jake Doe";
        // names[5] = 12; // Required type: String, Provided: int



        for (String name : names) System.out.println(name); // first way to do
        System.out.println();
        for (int i = 0; i < names.length; i++) System.out.println(names[i]); // second way to do


        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) numbers[i] = i + 1; // Assign

        for (int i = 0; i < numbers.length; i++) System.out.println(numbers[i]); // Print

/*
        // Taking array items from user

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int arrayLength = scanner.nextInt();
        Integer[] numbersArray = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            System.out.print("Enter an integer for " + i + ". index"+ ": ");
            numbersArray[i] = scanner.nextInt();
        }

        System.out.print("Which index do you want to see: ");
        int selected = scanner.nextInt();
        System.out.println(numbersArray[selected]);

        System.out.println("ALL indexes");
        for (int i = 0; i < numbersArray.length; i++) System.out.println(numbersArray[i]);


        System.out.println("");

        Scanner reader = new Scanner(System.in);

        int[] numbers2 = new int[5]; // Create
        numbers2[0] = 42;
        numbers2[1] = 13;
        numbers2[2] = 12;
        numbers2[3] = 7;
        numbers2[4] = 1;

        System.out.println("Which index should we access? ");
        int index = Integer.parseInt(reader.nextLine());

        System.out.print(numbers2[index]);
        */

        System.out.println("--------------------------------");

        int[] numb = new int[3];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;

        listElements(numb);


        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

        System.out.println();

        int[] array2 = {5, 1, 3, 4, 2};
        printArrayInStars(array2);

        System.out.println();
    } // main


    public static void printArrayInStars (int[] array) {
        for (int num : array) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printNeatly(int[] array) {
        for (int arr : array) System.out.print(arr + ", ");
    }


    // Array as a parameter of a method
    public static void listElements(int[] integerArray) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < integerArray.length) {
            int number = integerArray[index];
            System.out.print(number + " ");
            index = index + 1;
        }

        System.out.println("");
    }
}