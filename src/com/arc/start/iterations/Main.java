package com.arc.start.iterations;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {
            System.out.print("Enter Num: ");

            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            System.out.println(n * n);
        }
    }
}
