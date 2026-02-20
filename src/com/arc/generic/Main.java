package com.arc.generic;

import java.awt.*;
import java.util.ArrayList;

// Using the Generic Class
public class Main {
    public static void main(String[] args) {
        // Box for Integer
//        Box<Integer> intBox = new Box<>(123);
//        System.out.println("Integer Value: " + intBox.getItem());
//
//        // Box for String
//        Box<String> strBox = new Box<>("Hello Generics");
//        System.out.println("String Value: " + strBox.getItem());

        FruiteBasket basket = new FruiteBasket();
        basket.add(new Apple("elma1"));
        basket.add(new Apple("elma2"));
        basket.add(new Apple("elma3"));
//        basket.add("elma4");
        basket.showFruiteBasket();

//        basket.add(new Pineapple("ananas1"));

        GenericFruitBasket<Apple> basket2 = new GenericFruitBasket();
        basket2.add(new Apple("elma1"));
        basket2.add(new Apple("elma2"));

        GenericFruitBasket<Pineapple> basket3 = new GenericFruitBasket();
        basket3.add(new Pineapple("Pineapple1"));
        basket3.add(new Pineapple("Pineapple2"));

//        basket2.add("nanay");
        basket2.showFruiteBasket();
        basket3.showFruiteBasket();


        GenericBasketArrayList<Apple> basket4 = new GenericBasketArrayList();
        basket4.add(new Apple("elmaType2-1")); // Uses ArrayList's add function without need to create override add function
        basket4.removeFirst();
        basket4.showFruiteBasket();

    }
}
