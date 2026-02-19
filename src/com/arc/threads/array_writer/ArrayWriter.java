package com.arc.threads.array_writer;

import java.util.Arrays;

public class ArrayWriter implements Runnable{
    private final SimpleArray sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int value, SimpleArray array) {
        startValue = value;
        sharedSimpleArray = array;
    }

    public synchronized void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            sharedSimpleArray.add(i);

            // synchronized
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
