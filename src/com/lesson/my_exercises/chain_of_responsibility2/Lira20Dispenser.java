package com.lesson.my_exercises.chain_of_responsibility2;

public class Lira20Dispenser implements DispenseChain{
    protected DispenseChain next;

    @Override
    public void dispense(int amount) {
        if (amount>=20) {

            int numBills = amount / 20;
            int remainder = amount % 20;

            System.out.println("Dispensing: " + numBills + " x 20 TL");
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
