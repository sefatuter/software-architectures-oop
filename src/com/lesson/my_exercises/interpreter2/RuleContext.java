package com.lesson.my_exercises.interpreter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuleContext {
    public List<String> states = new ArrayList<>();

    void addState(String state){
        states.add(state);
    }
}

