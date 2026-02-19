package com.arc.threads.basics;

public class PrintTaskC implements Runnable{
    String text;
    PrintTaskC(String text){
        this.text = text;
    }

    @Override
    public void run() {
        System.out.println(text);
    }
}
