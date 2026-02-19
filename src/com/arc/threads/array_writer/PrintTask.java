package com.arc.threads.array_writer;

public class PrintTask implements Runnable {
    private String name;

    public PrintTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " started counter.");

        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
