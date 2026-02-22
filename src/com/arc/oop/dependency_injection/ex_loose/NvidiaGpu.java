package com.arc.oop.dependency_injection.ex_loose;

public class NvidiaGpu implements GraphicsCard{
    @Override
    public void render(){
        System.out.println("Game rendering with Nvidia GPU...");
    }
}
