package com.arc.oop.encapsulation_example;

//  import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------- Welcome to Box Office App --------------");
//        System.out.print("Please Enter TCKN : ");
//        String tckn = scanner.nextLine();

        TCKN tcknObject = new TCKN();
//        tcknObject.setTckn(tckn);

        while(tcknObject.control) {
            System.out.print("Please Enter TCKN : ");
            String tckn = scanner.nextLine();
            tcknObject.setTckn(tckn);
        }
        String s = tcknObject.getTckn();
        System.out.println(s);
    }
}