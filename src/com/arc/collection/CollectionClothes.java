package com.arc.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionClothes<T> extends ArrayList<T> implements AutoCloseable {

    public void showClothes() {
        this.forEach(System.out::println);

    }

    @Override
    public void close() throws Exception {
        System.out.println("list is closed.");
    }

}
