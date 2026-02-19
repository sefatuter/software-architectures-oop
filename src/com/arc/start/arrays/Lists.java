package com.arc.start.arrays;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);

        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(4.2);

        ArrayList<Boolean> listBool = new ArrayList<>();
        listBool.add(true);

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("String is a reference-type variable");

        System.out.println(listInt);
        System.out.println(listDouble);
        System.out.println(listBool);
        System.out.println(listStr);

        System.out.println();

        ArrayList<Integer> integers = new ArrayList<>();
        int integer = 1;
        integers.add(integer);

        ArrayList<Double> doubles = new ArrayList<>();
        double d = 4.2;
        doubles.add(d);

        System.out.println(integers);
        System.out.println(doubles);
        System.out.println();
        // create the word list for storing strings
        ArrayList<String> wordList = new ArrayList<>();

        // add two values to the word list
        wordList.add("First");
        wordList.add("Second");

        // retrieve the value from position 0 of the word list, and print it
        System.out.println(wordList.get(1));

        System.out.println();

        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        int index = 0;
        // Repeat for as long as the value of the variable `index`
        // is smaller than the size of the teachers list
        while (index < teachers.size()) {
            System.out.println(teachers.get(index));
            index = index + 1;
        }

        System.out.println();

        /*
        ForEach Loop

        ArrayList<String> teachers2 = new ArrayList<>();


        teachers2.add("Simon");
        teachers2.add("Samuel");
        teachers2.add("Ann");
        teachers2.add("Anna");

        for (String teacher : teachers2) {
            System.out.println(teacher);
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sumList = new ArrayList<>();

        while (true) {
            System.out.print("Enter number to sum (to exit enter -1) : ");
            int number = sc.nextInt();

            if (number == -1) {
                break;
            }
            sumList.add(number);
        }
        int sum = 0;
        for (int i = 0; i < sumList.size(); i++) {
            sum += sumList.get(i);
        }
        System.out.println("Sum: " + sum);

        */


        // Removing Value

        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

        list.remove(1);

        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));

        System.out.println();

        ArrayList<String> listSearch = new ArrayList<>();

        listSearch.add("First");
        listSearch.add("Second");
        listSearch.add("Third");

        System.out.println("Is the first found? " + listSearch.contains("First"));

        boolean found = listSearch.contains("Second");
        if (found) {
            System.out.println("Second was found");
        }

        // or more simply
        if (listSearch.contains("Second")) {
            System.out.println("Second can still be found");
        }

    }
}
