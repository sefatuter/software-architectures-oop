package com.arc.collection;

import java.util.Comparator;

public class ComparatorClothes<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1 instanceof Pants && o2 instanceof Pants) {
            return (int) (((Pants) o2).price - ((Pants) o1).price);
        }
        else if ( o1 instanceof Shirt && o2 instanceof Shirt) {
            return (int) (((Shirt) o2).price - ((Shirt) o1).price);
        }

        throw new IllegalArgumentException("Can't compare objects of type " + o1.getClass().getName());
    }
}
