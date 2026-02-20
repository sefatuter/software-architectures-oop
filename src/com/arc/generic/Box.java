package com.arc.generic;

// Define a generic class with a type parameter T
public class Box<T> {
    private T item;
    private int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    // Constructor
    public Box(T item) {
        this.item = item;
    }

    // Getter
    public T getItem() {
        return item;
    }

    // Setter
    public void setItem(T item) {
        this.item = item;
    }
}
