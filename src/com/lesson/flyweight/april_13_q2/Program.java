package com.lesson.flyweight.april_13_q2;

public class Program {
    public static void main(String[] args) {

        FontFactory fontFactory = new FontFactory();

        IFont font1 = fontFactory.getFont("Arial");
        IFont font2 = fontFactory.getFont("Times New Roman");
        IFont font3 = fontFactory.getFont("Deneme Font");

        font1.setColor("Red");
        font1.setSize(12);
        font1.setStyle("Bold");
        font1.display("This is a sample text for Arial.");

        font2.setStyle("Italic");
        font2.setSize(14);
        font2.setColor("Blue");
        font2.display("This is a sample text for Times New Roman."); // FIX

        font3.setColor("Green");
        font3.setSize(14);
        font3.setStyle("Underline");
        font3.display("This is a sample text for Deneme Font"); // FIX
    }
}