package com.arc.oop.dependency_injection.ex_tight;

// 2. The Consumer Class (Tightly Coupled)
public class Computer {
    // Direct dependency on a specific class
    private NvidiaGpu gpu;

    public Computer() {
        // ERROR: The class creates its own dependency using 'new'.
        // This Computer is forever glued to Nvidia.
        this.gpu = new NvidiaGpu();
    }

    public void playGame() {
        this.gpu.render();
    }
}
