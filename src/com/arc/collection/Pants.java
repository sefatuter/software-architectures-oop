package com.arc.collection;

public class Pants implements Comparable<Pants> {

    public String name;
    public float price;

    public Pants(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Pants o) {
        return (int) (this.price - o.price);
    }

    @Override
    public String toString() {
        return name+"\t"+price;
    }

}
