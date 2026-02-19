package com.arc.interfaces;

public abstract class Animal {
    public int number = 10;

    public Animal(){
        System.out.println(number);
    }

    public abstract void sesCikar();

    static public void haraketEt() {
    }

}
