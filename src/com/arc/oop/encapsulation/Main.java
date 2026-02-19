package com.arc.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.setId(10L);
        System.out.println("Worker id is " + worker.getId());
        worker.setSalary(8000); // Not going to work because of the condition
        worker.setSalary(1500);
        System.out.println("Worker salary is " + worker.getSalary());
    }
}
