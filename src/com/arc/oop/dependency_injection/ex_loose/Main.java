package com.arc.oop.dependency_injection.ex_loose;

public class Main {
    public static void main(String[] args) {

        GraphicsCard nvidiaCart = new NvidiaGpu();
        // Sol Taraf (Referans) ve Sağ Taraf (Nesne).

        Computer computer = new Computer(nvidiaCart);
        computer.playGame();
    }
}
