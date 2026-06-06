package com.lesson.my_exercises.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> treeTypes = new HashMap<>();

    public static Tree getTreeType(String name, String color){
        String key = name + "-" + color;

        if(!treeTypes.containsKey(key)){
            treeTypes.put(key, new TreeType(name, color));
            System.out.println("New tree type created in memory: " + name);
        }

        return treeTypes.get(key);
    }
}
