package com.arc.oop.dependency_injection.ex_tight;

public class Main {
    public static void main(String[] args) {

        // 1. Create the Computer
        // CRITICAL PROBLEM: You cannot pass an argument here.
        // You have zero control over which GPU is used.
        Computer rigidComputer = new Computer();

        // 2. Play the game
        rigidComputer.playGame();

        // Output: "Rendering graphics with Nvidia GPU..."

        // --- THE LIMITATION ---
        // If you want an AMD GPU now, you are stuck.
        // You cannot say: new Computer(new AmdGpu()); // Compiler Error!
        // Because the Computer constructor does not accept any parameters.
        // To change the GPU, you must go back and rewrite 'Computer.java'.
    }
}