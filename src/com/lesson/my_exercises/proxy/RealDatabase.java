package com.lesson.my_exercises.proxy;

public class RealDatabase implements Database{

    @Override
    public void runQuery(String query) {
        System.out.println("Db query is running " + query);
    }
}
