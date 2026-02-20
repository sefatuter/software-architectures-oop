package com.arc.generic;

import java.util.ArrayList;

public class FruiteBasket {
    ArrayList<Apple> list = new ArrayList<>();

    public void add(Apple apple) {
        list.add(apple);
    }

    public void showFruiteBasket() {
        list.forEach(System.out::println);
    }

}

