package com.lesson.flyweight.april_13_q2;

public class ConcreteFont implements IFont{

    private  String color;
    private int size;
    private String style;

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display(String text) {
        System.out.println("Text: " + text + " Size: " + size + " Color: " + color);
    }

    @Override
    public void setStyle(String style) {
        this.style = style;

    }
}
