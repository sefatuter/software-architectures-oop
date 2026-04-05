package com.lesson.my_exercises.composite2;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Dev{

    List<Dev> team = new ArrayList<>();

    Manager(String name){ super(name); }

    void add(Dev d){
        team.add(d);
    }

    @Override
    void print() {
        System.out.println(" - Manager " + name);
        for (Dev d: team){
            d.print();
        }
    }
}