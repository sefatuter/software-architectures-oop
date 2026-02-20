package com.arc.generic;

import java.util.ArrayList;

public class GenericBasketArrayList<T> extends ArrayList<T> {

    public void showFruiteBasket() {
        this.forEach(System.out::println);
    }

}
