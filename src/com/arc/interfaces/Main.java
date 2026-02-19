package com.arc.interfaces;

public class Main {
    public static void main(String[] args) {
        //Yazilimci yazilimci = (Yazilimci) new Employee( "Sefa", "Tuter", "128371287312");
        // // Employee employees[] = new Employee[2];
        // // employees[0] = yazilimci;
        Yazilimci yazilimci = new Yazilimci("123", "123","123","123");

        A a = new A();
        System.out.println(a.name);
        B b = a;

        System.out.println(b.name);

    }
}