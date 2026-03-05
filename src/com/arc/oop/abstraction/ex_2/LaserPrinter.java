package com.arc.oop.abstraction.ex_2;

// Subclass 2: Laser
public class LaserPrinter extends BasePrinter {
    public LaserPrinter(String name) {
        super(name);
    }

    @Override
    public void printDocument(String content) {
        System.out.println("Using toner and heat to print: " + content);
    }
}