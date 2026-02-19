package com.arc.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class MyGUI extends JFrame{
    private JPanel panel;

    private JTextField textField;
    private JButton jButton1;
    private JLabel jLabel;

    public MyGUI(){
        panel = new JPanel();
        textField = new JTextField(20);
        jLabel = new JLabel();
        jButton1 = new JButton();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My GUI");
        setSize(500,500);
        setVisible(true);
        textField.setSize(100,100);
        jButton1.setPreferredSize(new Dimension(100,25));
        jButton1.setText("OK");
        jLabel.setText("Welcome to My GUI");

        textField.addActionListener(new TextFieldHandler());

        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(MyGUI.this, textField.getText());
            }
        });


        panel.add(textField);
        panel.add(jButton1);
        panel.add(jLabel);
        add(panel);

    }

    public class TextFieldHandler implements ActionListener  {
        public void actionPerformed(ActionEvent e){
            jLabel.setText(e.getActionCommand());
        }
    }

}
