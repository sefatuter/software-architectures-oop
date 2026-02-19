package com.arc.conditions;

import java.util.concurrent.ArrayBlockingQueue;

public class ABQ implements Buffer{
    private final ArrayBlockingQueue<Integer> buffer;

    public ABQ(){
        buffer = new ArrayBlockingQueue<>(1);
    }

    public void set(int value) throws InterruptedException {
        buffer.put(value);
    }

    public int get() throws InterruptedException {
        int readValue = buffer.take();
        return readValue;
    }
}
