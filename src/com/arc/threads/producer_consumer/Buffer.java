package com.arc.threads.producer_consumer;

public interface Buffer {

    public void set( int value ) throws InterruptedException;
    public int get() throws InterruptedException;

}
