package com.lesson.observer.april_20_q1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.Attach(new CustomerObserver("Ali")); // FIX

        product.changeStock();
    }
}