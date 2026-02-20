package com.arc.questions.ex_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//
//
//        double result = num1 + num2;

//        System.out.println(result);


// Static Understanding.
        // Calling the static method directly (Using class name).
        Test.testmethod();

        // Creating an instance of the Test class.
        Test nonStaticTestInstance = new Test();

        // Calling the non-static method using the instance
        nonStaticTestInstance.testmethod2();


    }
}
