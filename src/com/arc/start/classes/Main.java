package com.arc.start.classes;
import javax.swing.*;

public class Main {
    private JLabel jsFirstName;
    private JPanel MyPanel;
    private JLabel jsLabel;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2022;
        myCar.run();
    }
}