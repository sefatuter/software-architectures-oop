package com.lesson.my_exercises.chain_of_responsibility;

public class Developer extends Employee{

    @Override
    public void withdraw(int amount) {
        if(amount <= 10000){
            System.out.println("Approved by developer : " + amount);
        }
        else if(nextApprover != null){
            nextApprover.withdraw(amount);
        }
    }
}
