package com.arc.conditions;

public class ConsumerABQ implements Runnable{

    private Buffer buffer;
    private int readVal;

    public ConsumerABQ(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            try {
                readVal = buffer.get();
                System.out.println("Consumer read : " + readVal);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
