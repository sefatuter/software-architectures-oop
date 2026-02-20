package com.arc.gui.ex_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField textField1;
    private JLabel jsFirstName;
    private JButton clickMeButton;
    private JPanel MyPanel;

    public Main() {
        setContentPane(MyPanel);
        setTitle("MyGUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "Welcome " + textField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

}
