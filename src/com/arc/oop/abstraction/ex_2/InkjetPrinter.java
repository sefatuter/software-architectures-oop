package com.arc.oop.abstraction.ex_2;

// Subclass 1: Inkjet
public class InkjetPrinter extends BasePrinter {
    public InkjetPrinter(String name) {
        super(name);
    }

    @Override
    public void printDocument(String content) {
        System.out.println("Using ink cartridges to print: " + content);
    }
}