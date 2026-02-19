package com.arc.threads.array_writer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {


        SimpleArray sharedSimpleArray = new SimpleArray(6);

        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(writer1);
        executor.execute(writer2);
        executor.shutdown();

        try {
            boolean tasksEnded = executor.awaitTermination(1, TimeUnit.MINUTES);
            if (tasksEnded) {
                System.out.print("All tasks ended" + sharedSimpleArray);
            } else
                System.out.println("timed out");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

//        PrintTask task1 = new PrintTask( "task1" );
//        PrintTask task2 = new PrintTask( "task2" );
//        PrintTask task3 = new PrintTask( "task3" );
//
//        System.out.println("Starting executor");
//
//        ExecutorService threadExecutor = Executors.newCachedThreadPool();
//
//        threadExecutor.execute(task1);
//        threadExecutor.execute(task2);
//        threadExecutor.execute(task3);

    }
}