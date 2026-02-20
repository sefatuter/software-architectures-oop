package com.arc.generic;

import java.util.ArrayList;

public class GenericFruitBasket<T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public void showFruiteBasket() {
        list.forEach(System.out::println);
    }

}
