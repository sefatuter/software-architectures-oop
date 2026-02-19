package com.arc.oop.override_example;

public class B extends A{
    int x;
    B(){
        x=5;
        f();
    }

    @Override
    void f() {
        System.out.println(x);
        System.out.println("çalıstı");
    }
}
