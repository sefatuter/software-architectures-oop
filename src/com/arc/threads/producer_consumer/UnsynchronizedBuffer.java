package com.arc.threads.producer_consumer;

public class UnsynchronizedBuffer implements Buffer{
    private int buffer = -1;

    public void set(int value) throws InterruptedException {
        System.out.printf("Producer writes \t\t%2d\n", value);
        buffer = value;
    }
    public int get() throws InterruptedException {
        System.out.printf("Consumer reads \t\t%2d\n", buffer);
        return buffer;
    }
}
