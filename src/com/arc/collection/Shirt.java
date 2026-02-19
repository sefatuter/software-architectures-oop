package com.arc.collection;

public class Shirt implements Comparable<Shirt> {

    public String name;
    public float price;

    public Shirt(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Shirt o) {
        return (int) (this.price - o.price);
    }

    @Override
    public String toString() {
        return name+"\t"+price;
    }

}