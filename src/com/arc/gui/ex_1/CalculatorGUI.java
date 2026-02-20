package com.arc.gui.ex_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private com.arc.gui.ex_1.Calculator calculator;

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
