package com.arc.generic;

import java.util.ArrayList;

public class GenericT {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);

        System.out.println(list2);
    }
}
