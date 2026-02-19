package com.arc.oop.inheritance.model_two;

public class B extends C{

    public int bVar1;
    public int bVar2;

    public B() {
        System.out.println("We are in B constructor");
    }

    public B(int bVar1) {
        this.bVar1 = bVar1;
    }

    public B(int bVar1, int bVar2) {
        this.bVar1 = bVar1;
        this.bVar2 = bVar2;
    }

    public void bClassMethod() {
        System.out.println("B Class Method");
    }


}