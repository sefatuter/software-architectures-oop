package com.lesson.my_exercises.chain_of_responsibility2;

public class Lira10Dispenser implements DispenseChain{
    protected DispenseChain next;

    @Override
    public void dispense(int amount) {
        if (amount>=10) {

            int numBills = amount / 10;
            int remainder = amount % 10;

            System.out.println("Dispensing: " + numBills + " x 10 TL");
            if (remainder > 0 && next != null){
                next.dispense(remainder);
            }
        } else if (next != null){
            next.dispense(amount);
        }
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.next = nextChain;
    }
}
