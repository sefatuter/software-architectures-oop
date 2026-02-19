package com.arc.threads.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer{

    private final ArrayBlockingQueue<Integer> buffer;

    public BlockingBuffer() {
        buffer = new ArrayBlockingQueue<>(1);
    }

    public void set( int value) throws InterruptedException {
        buffer.put(value);
        System.out.printf("%s%2d\t%s%d\n", "Producer writes", value, "buffer cells occupied: ", buffer.size());
    }
    public int get() throws InterruptedException {
        int readValue = buffer.take();
        System.out.printf("%s %2d\t%s%d\n", "Consumer reads", readValue, "buffer cells occupied: ", buffer.size());
        return readValue;
    }

}
