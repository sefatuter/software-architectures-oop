package com.lesson.my_exercises.chain_of_responsibility;

public class Leader extends Employee{
    @Override
    public void withdraw(int amount) {
        if (amount > 10000){
            System.out.println("Approved by Leader");
        } else if (nextApprover != null) {
            nextApprover.withdraw(amount);
        } else {
            System.out.println("Amount too large.");
        }
    }
}
