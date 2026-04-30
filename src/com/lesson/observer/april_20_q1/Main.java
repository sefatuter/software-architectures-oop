package com.lesson.observer.april_20_q1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        Observer ali = new CustomerObserver("Ali");
        Observer ayse = new CustomerObserver("Ayşe");

        product.attach(ali);
        product.attach(ayse);

        product.changeStock();
    }
}