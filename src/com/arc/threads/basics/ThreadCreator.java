package com.arc.threads.basics;

public class ThreadCreator {
    public static void main(String[] args) {
        System.out.println("Creating Threads");

        Thread thread1 = new Thread(new PrintTask("task1"));
        Thread thread2 = new Thread(new PrintTask("task2"));
        Thread thread3 = new Thread(new PrintTask("task3"));

        System.out.println("Threads created.");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Task started main ends.");

    }
}

