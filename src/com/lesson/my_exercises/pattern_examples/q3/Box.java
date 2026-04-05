package com.lesson.my_exercises.pattern_examples.q3;

import java.util.ArrayList;
import java.util.List;

public class Box extends Items{
    int totalSum;

    List<Items> boxContent = new ArrayList<>();

    public Box(int totalSum){
        this.totalSum = totalSum;
    }

    public void add(Item item){
        boxContent.add(item);
    }


    @Override
    int fiyatHesapla() {
        int sum = totalSum;
        for(Items i: boxContent){
            sum += i.fiyatHesapla();
        }
        return sum;
    }
}
