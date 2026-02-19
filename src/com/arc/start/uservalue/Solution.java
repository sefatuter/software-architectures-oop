package com.arc.start.uservalue;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // takes input

        // print , println (printLine)
        /*
        nextLine()  -> String
        nextInt()   -> Integer
        nextByte()  -> Byte
        nextFloat() -> Float
        nextDouble()-> Double
         */

        /*
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine(); // takes string from user

        System.out.print("Enter your Surname: ");
        String surname = scanner.nextLine(); // takes string from user

        System.out.print("Name -> " + name + "\n" + "Surname -> " + surname);

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.print("Name -> " + name + "\n" + "Age -> " + age);
        scanner.close();
        */

        // Type Conversions

        // String to Int
        String a = "5";
        String b = "10";

        System.out.println(a+b);

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        System.out.println(x+y);


        // Int to String
        int m = 21;
        String n = String.valueOf(m);
        System.out.println(n+4);

        // Double to Int
        double d = 5.50;
        int num1 = (int)d;
        System.out.println(num1);

        // Int to Double
        int i = 112;
        double j = (double)i;
        System.out.println(j);

        // Float to Long
        float h = 7.12f;
        long k = (long)h;
        System.out.println(k);

        // Long to Float
        long l = 124;
        float o = (float)l;
        System.out.println(o);

        // Long to String
        String s = String.valueOf(l);
        System.out.println(s+5);

        // Float to String
        float p = 3.14f;
        String ss = String.valueOf(p);
        System.out.println(ss+4);

        // Byte to String

        byte bt = 66;
        String st =Byte.toString(bt);
        System.out.println(st+11);


        // Switch Case

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please Enter Number");
        int num11 = scanner1.nextInt();

        switch (num11) {
            case 1:
                System.out.println(num11);
                break;
            case 2:
                System.out.println("Entered " + num11);
        }

        // Strings

        Scanner reader = new Scanner(System.in);

        System.out.print("Give a word: ");
        // reading a line from the user and assigning it to the name variable
        String name = reader.nextLine();

        System.out.println(name);

        System.out.println("-----------------------------");

        // String Comparisons And "Equals"
        System.out.print("Enter text: ");
        String text = reader.nextLine();

        if (text.equals("marzipan")) { // or text.equals(anotherText)
            System.out.println("The text variable contains the text marzipan.");
        } else {
            System.out.println("The text variable does not contain the text marzipan.");
        }

        // NB! You can't compare strings with ==!

        String text2 = "first second third fourth";
        String[] pieces = text2.split(" "); // split method
        System.out.println(pieces[0]);
        System.out.println(pieces[1]);
        System.out.println(pieces[2]);
        System.out.println(pieces[3]);

        System.out.println();

        for (String piece : pieces) {
            System.out.println(piece);
        }

        System.out.println();
        // contains method

        String text3 = "volcanologist";

        if (text3.contains("can")) {
            System.out.println("can was found");
        }

        if (!text3.contains("tin")) {
            System.out.println("tin wasn't found");
        }

        System.out.println("----------------------");
        int sum = 0;

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) { // quit if enters nothing
                break;
            }

            String[] parts = input.split(","); // split from ,
            sum = sum + Integer.valueOf(parts[1]); // sum ages
        }

        System.out.println("Sum of the ages is " + sum);

    }
}


