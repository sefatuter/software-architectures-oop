package com.arc.oop.inheritance.model_two;

public class A extends B{

    // super();
    // 1- Must be top of the code
    // 2- Must be used in constructive method.

    public int aVar1;
    public int aVar2;

    public A() {
        System.out.println("We are in A constructor");
    }

    public A(int aVar1, int aVar2) {
        super(aVar1, aVar2); // üst sinifin constructoruna gonderir.
//        this.aVar1 = aVar1; // "this." is used to specify the variable of the class. = aVar1 is the parameter of constructor.
//        this.aVar2 = aVar2;
    }

    public void aClassMethod() {
        System.out.println("A class method");
        //subclass to inheriting class, the inheriting class is called super
        super.bClassMethod(); // Mirasi aldigin sinifa git demek.
    }
}
