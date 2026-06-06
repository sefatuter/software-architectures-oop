package com.lesson.my_exercises.chain_of_responsibility;

public abstract class Employee {

    protected Employee nextApprover; // zincirin sonraki halkası

    public void setNext(Employee next){
        this.nextApprover = next;
    }

    public abstract void withdraw(int amount);
}
