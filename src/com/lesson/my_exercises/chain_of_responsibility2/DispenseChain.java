package com.lesson.my_exercises.chain_of_responsibility2;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(int amount);
}
