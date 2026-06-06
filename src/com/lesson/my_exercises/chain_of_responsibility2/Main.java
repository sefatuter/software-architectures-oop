package com.lesson.my_exercises.chain_of_responsibility2;

public class Main {
    public static void main(String[] args) {

        Lira50Dispenser lira50Dispenser = new Lira50Dispenser();
        Lira20Dispenser lira20Dispenser = new Lira20Dispenser();
        Lira10Dispenser lira10Dispenser = new Lira10Dispenser();

        lira50Dispenser.setNextChain(lira20Dispenser);
        lira20Dispenser.setNextChain(lira10Dispenser);

        lira50Dispenser.dispense(180);
    }
}
