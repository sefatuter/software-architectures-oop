package com.arc.threads.basics;

public class MainC {
    public static void main(String[] args) {
        final int x = 5;
        Thread[] threadArray = new Thread[x];
        for(int i = 0; i < x; i++){
            threadArray[i] = new Thread( new PrintTaskC("task" + i));
        }
        for(int i = 0; i < x; i++){
            threadArray[i].start();
        }
    }
}
