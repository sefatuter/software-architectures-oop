package com.lesson.my_exercises.pattern_examples.q3;

public class Item extends Items{
    int price;

    public Item(int price){
        this.price = price;
    }

    @Override
    int fiyatHesapla() {
        return this.price;
    }
}
