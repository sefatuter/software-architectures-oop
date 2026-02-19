package com.arc.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private Calculator calculator;

    public CalculatorGUI() {
        calculator = new Calculator();
        display = new JTextField();

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Add buttons 0-9 and operations
        String[] buttons = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Handle operations and display updates here

        if (command.equals("0")) {

        }

    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
