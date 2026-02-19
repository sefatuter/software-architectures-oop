package com.arc.start.helloworld;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); // Comment line
        System.out.println(1000);
        System.out.println(11 * 11);

        String name = "john";
        int age = 20; // age = 11;
        float myFloat = 5.99f;
        boolean myBoolean = true;
        char myChar = 'A';

        System.out.println(name);
        System.out.println(age);
        System.out.println(myFloat);
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println("Hello " + name + " " + age + " " + myFloat + " " + myBoolean + " " + myChar);


        long num = 12314214124L; // Add L to end of the line
        System.out.println(num);

        long a = Long.MAX_VALUE, b = Long.MIN_VALUE;
        System.out.println(a);
        System.out.println(b);

        // -128 to 128 1 byte

        byte num2 = (byte) 12;
        System.out.println(num2);

        // -32768 to 32768
        short num3 = (short) 123;
        System.out.println(num3);
        System.out.println();

        // int and Integer class
        // long and Long
        // double and Double

        float maxFloat = Float.MAX_VALUE;
        System.out.println(maxFloat);
        float minFloat = Float.MIN_VALUE;
        System.out.println(minFloat);

        float floatNum = 16.7f;
        System.out.println(floatNum);

        // double D
        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble);
        double minDouble = Double.MIN_VALUE;
        System.out.println(minDouble);

        double doubleNum = 16.71827392649824D;
        System.out.println(doubleNum);


        boolean result = true;
        System.out.println(result);


        char ch = '?';
        System.out.println(ch);

        int x = 10, n = 10;
        float y = 2.4f;
        float aa = x*y; // int = int or float=float must be !!
        System.out.println(aa);

        System.out.println(++x); // increase x and print
        System.out.println(n++); // print n and increase
        System.out.println(n);

        // && and
        // || or
        // ! not
        // ?: ternary

        String result2 = x < 5 ? "True" : "False";
        System.out.println(result2);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Midterm1 Exam: ");
        double exam1  = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Midterm2 Exam: ");
        double exam2  = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Final Exam: ");
        double finalExam  = Double.parseDouble(scanner.nextLine());

        double resultExam = (exam1*0.3) + (exam2*0.3) + (finalExam*0.4);

        System.out.println("Your Grade = " + resultExam);

        if (resultExam < 60) System.out.print("You Failed. " + name1);
        else System.out.print("You Passed. " + name1);


        /* Double */
        double whenDividendIsFloat = 3.0 / 2;
        System.out.println(whenDividendIsFloat); // prints 1.5

        double whenDivisorIsFloat = 3 / 2.0;
        System.out.println(whenDivisorIsFloat); // prints 1.5

        int first = 3;
        int second = 2;

        double results1 = (double) first / second;
        System.out.println(results1); // prints 1.5

        double results2 = first / (double) second;
        System.out.println(results2); // prints 1.5

        double result3 = (double) (first / second);
        System.out.println(result3); // prints 1.0

    }
}