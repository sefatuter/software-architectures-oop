package com.arc.gui.ex_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JButton button1;
    private JLabel jsLabel;
    private JPanel panel1;

    public Main() {
        super("My GUI");
        button1 = new JButton("Click Me");
        panel1 = new JPanel();
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
