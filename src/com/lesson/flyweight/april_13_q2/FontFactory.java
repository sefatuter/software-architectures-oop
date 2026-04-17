package com.lesson.flyweight.april_13_q2;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, IFont> fonts = new HashMap<>();

    public IFont getFont(String key) {
        if (!fonts.containsKey(key)) { // FIX
            fonts.put(key, new ConcreteFont());
        }
        return fonts.get(key);
    }
}