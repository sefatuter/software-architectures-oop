package com.arc.conditions;

public class ConditionTestABQSynchronized implements Buffer{

    private int buffer = -1;
    private boolean occupied;

    public synchronized void set(int value) throws InterruptedException {
        if (occupied){
            wait();
        }
        occupied = true;
        buffer = value;
        notify();
    }

    public synchronized int get() throws InterruptedException {
        if (!occupied){
            wait();
        }
        occupied = false;
        int readValue = buffer;
        notify();
        return readValue;
    }

}

