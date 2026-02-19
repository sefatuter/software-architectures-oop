package com.arc.oop.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Worker worker1 = new Worker();

        System.out.println("---------------Welcome to app---------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter no: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter experience: ");
        int experience = scanner.nextInt();

        System.out.print("Please enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("--------------------------------------------");

        Worker worker = new Worker(no, name, lastName, experience, salary);

        while (true) {
            String operations = "1- Show worker information\n" + "2- Raise salary\n" + "3- Reset computer\n" + "4- Exit";

            System.out.print(operations + "\nChoose your operation: ");
            int option = scanner.nextInt();

            if (option == 4) {
                System.out.println("--------------------------------");
                System.out.println("Successfully exited.");
                System.out.println("--------------------------------");
                break;
            }

            switch (option) {
                case 1:
                    System.out.println("Entered 1");
                    worker.showWorkerInfo();
                    break;

                case 2:
                    System.out.println("Entered 2");
                    System.out.print("Enter raise amount: "); // Be sure enter with , comma 100,10
                    double raise = scanner.nextDouble();
                    worker.makeRaise(raise);
                    break;
                case 3:
                    System.out.println("Entered 3");
                    System.out.print("Enter operating system to reset: ");
                    scanner.nextLine(); // if string taken after int scanner use this to prevent errors of \n
                    String os = scanner.nextLine();
                    worker.resetComputer(worker.name, os);
                    break;
                default:
                    System.out.println("--------------------------------");
                    System.out.println("Enter valid choice!");
                    System.out.println("--------------------------------");
                    break;
            }
        }


    }
}
