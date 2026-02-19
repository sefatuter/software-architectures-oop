package com.arc.questions.q_one;

public class B extends A {
    static int x = 5;
    B(){
        x = 7;
        f();
    }
    @Override
    void f(){
        System.out.println(x);
    }
}
