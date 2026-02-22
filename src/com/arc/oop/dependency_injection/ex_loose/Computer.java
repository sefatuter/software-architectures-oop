package com.arc.oop.dependency_injection.ex_loose;

public class Computer {

    private GraphicsCard gpu;

    public Computer(GraphicsCard gpu){
        this.gpu = gpu;
    }

    void playGame(){
        this.gpu.render();
    }
}
