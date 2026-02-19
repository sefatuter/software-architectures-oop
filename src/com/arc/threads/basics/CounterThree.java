package com.arc.threads.basics;

public class CounterThree implements Runnable{
    private String name;
    private int id;
    private boolean isRunning = true;

    public CounterThree(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.name + " is executed");
        int i = 0;
        while (isRunning) {
            try {
                Thread.sleep(1000L * this.id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.name + " " + i++);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop(){
        this.isRunning = false;
        System.out.println(this.name + " is stopped");
    }
}
