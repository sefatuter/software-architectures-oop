package com.arc.conditions;

public class ProducerABQ implements Runnable {

    private Buffer buffer;

    public ProducerABQ(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                buffer.set(i);
                System.out.println("Producer write : " + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}