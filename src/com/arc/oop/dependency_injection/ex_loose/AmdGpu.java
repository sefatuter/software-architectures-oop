package com.arc.oop.dependency_injection.ex_loose;

public class AmdGpu implements GraphicsCard{
    @Override
    public void render(){
        System.out.println("Game rendering with AMD Gpu..");
    }
}
