package com.arc.threads.producer_consumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService application = Executors.newCachedThreadPool();

//1-        Buffer sharedLocation = new UnsynchronizedBuffer()
//2-        Buffer sharedLocation = new BlockingBuffer();
        Buffer sharedLocation = new SynchronizedBuffer();

        System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n", "operation", "buffer", "occupied",
                "----------", "---------\t---------");



//1-        System.out.println("Action \t\t\tValue\tSum of Produced\tSum of Consumed");
//2-        System.out.println("-------\t\t\t-------\t---------------\t---------------");

        application.execute(new Producer(sharedLocation));
        application.execute(new Consumer(sharedLocation));
        application.shutdown();


    }
}
