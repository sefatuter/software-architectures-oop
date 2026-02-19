package com.arc.collection;

import java.util.Collections;
import java.util.Comparator;

public class CollectionTest {
    public static void main(String[] args) {

        CollectionClothes<Pants> myPants = new CollectionClothes<Pants>();
        CollectionClothes<Shirt> myShirts = new CollectionClothes<Shirt>();

        myPants.add(new Pants("bulutPant", 1000));
        myPants.add(new Pants("sefaPant", 504));
        myPants.add(new Pants("pelinPant", 88));

        myShirts.add(new Shirt("sefaShrt", 123));
        myShirts.add(new Shirt("bulutShrt", 1999));
        myShirts.add(new Shirt("plenShirt", 9));

        Collections.sort(myPants);
        Collections.sort(myShirts);

        myPants.showClothes();
        System.out.println("\n");
        myShirts.showClothes();

        // With Comparator
        System.out.println("With comparator");

        Collections.sort(myPants, new ComparatorClothes<Pants>());
        Collections.sort(myShirts, new ComparatorClothes<Shirt>());

        myPants.showClothes();
        System.out.println("\n");
        myShirts.showClothes();


    }
}
