package com.arc.oop.abstraction.ex_2;

// Abstract Class provides a template
public abstract class BasePrinter {
    protected String printerName;

    public BasePrinter(String printerName) {
        this.printerName = printerName;
    }

    // Concrete Method: Every printer turns on the same way (Shared Logic)
    public void powerOn() {
        System.out.println(printerName + " is warming up...");
    }

    // Abstract Method: Every printer prints differently (Specific Logic)
    public abstract void printDocument(String content);
}
