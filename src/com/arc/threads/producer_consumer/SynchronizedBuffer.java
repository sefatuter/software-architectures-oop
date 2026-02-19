package com.arc.threads.producer_consumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class SynchronizedBuffer implements Buffer{
    //2-
    private int buffer = -1;
    //2-
    private boolean occupied = false;

    //2-
    private final Lock accessLock = new ReentrantLock();
    //2-
    private final Condition canWrite = accessLock.newCondition();
    private final Condition canRead = accessLock.newCondition();

//1-    private int buffer = -1;
//1-    private boolean occupied = false;

    //1- synchronized
    public void set(int value) throws InterruptedException {
//2-
        accessLock.lock();

        try {
            if (occupied) {
                System.out.println("producer tries to write.");
                displayState("buffer full. producer waits");
//1- wait();
                //2-
                canWrite.await();
            }
            buffer = value;
            occupied = true;
            displayState("producer writes " + buffer);
//1-notifyAll();
            //2-
            canRead.signal();
        }
        // added after
        finally {
            //2-
            accessLock.unlock();
        }
    }
    //1- synchronized
    public int get() throws InterruptedException {
        // added after line 40-41 and try catch
        int readValue = 0;
//2-
        accessLock.lock();
        try {
            if (!occupied) {
                System.out.println("consumer tries to read.");
                displayState("buffer empty. consumer waits.");
//1- wait();
//2-
                canRead.await();
            }
            occupied = false;
//1- displayState("consumer reads " + buffer);
//1- notifyAll();
//1- return buffer;

            // added after line 53-54-55-56 and finally block

//2-
            readValue = buffer;
//2-
            displayState("consumer reads " + readValue);
//2-
            canWrite.signal();
        }
        finally {
//2-
            accessLock.unlock();
        }
//2-
        return  readValue;
    }
    private void displayState(String operation) {
        System.out.printf("%-40s%d\t\t%b\n\n", operation, buffer, occupied);
    }
}