package com.arc.threads.producer_consumer;

import java.util.Random;

public class Producer implements Runnable{
    private final static Random generator = new Random();
    private final Buffer sharedLocation;

    public Producer(Buffer shared) {
        sharedLocation = shared;
    }

    public void run() {
        int sum = 0;;
        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep( generator.nextInt(100));
                sharedLocation.set( count );
                sum += count;
//                System.out.printf("\t%2d\n", sum);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Producer done producing \nTerminating Producer");

    }

}
