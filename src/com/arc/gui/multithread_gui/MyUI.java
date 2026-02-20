package com.arc.gui.multithread_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyUI extends JFrame implements ActionListener {
    private final JLabel label1;
    private final JButton button1;
    private final JTextArea textArea1;
    private final JPanel mainPanel;
    private final JLabel statusLabel;

    public MyUI() {
        // Set up the frame
        setTitle("Fibonacci Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize main panel with border layout
        mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create input panel
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Add title
        JLabel titleLabel = new JLabel("Fibonacci Calculator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 15, 0);
        inputPanel.add(titleLabel, gbc);

        // Create instruction label
        JLabel instructionLabel = new JLabel("Enter a number:");
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 5, 5);
        inputPanel.add(instructionLabel, gbc);

        // Initialize and configure text area
        textArea1 = new JTextArea(1, 10);
        textArea1.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea1.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        inputPanel.add(textArea1, gbc);

        // Initialize and configure calculate button
        button1 = new JButton("Calculate");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(this);
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(15, 0, 0, 0);
        inputPanel.add(button1, gbc);

        // Initialize result label
        label1 = new JLabel("Result will appear here");
        label1.setFont(new Font("Arial", Font.PLAIN, 14));
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        // Initialize status label
        statusLabel = new JLabel("");
        statusLabel.setForeground(Color.RED);
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(label1, BorderLayout.CENTER);
        mainPanel.add(statusLabel, BorderLayout.SOUTH);

        // Configure frame
        add(mainPanel);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Clear previous status
            statusLabel.setText("");

            // Validate input
            String input = textArea1.getText().trim();
            if (input.isEmpty()) {
                statusLabel.setText("Please enter a number");
                return;
            }

            int number = Integer.parseInt(input);
            if (number < 0) {
                statusLabel.setText("Please enter a non-negative number");
                return;
            }

            // Disable button during calculation
            button1.setEnabled(false);
            label1.setText("Calculating...");

            // Start calculation
            new BC(number, label1) { // yeni class yazmak yerine inline class olusturuldu, BC.java'yi extend eden adı olmayan inline class .
                @Override
                protected void done() {
                    super.done();  // super kullanımında Extend edilen class BC.java'daki BC() {}'den onun done() metodu cagirilir.
                    button1.setEnabled(true);
                }
            };

        } catch (NumberFormatException ex) {
            statusLabel.setText("Please enter a valid integer");
            label1.setText("Result will appear here");
        }
    }
}
