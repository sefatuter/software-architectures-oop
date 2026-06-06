package com.lesson.my_exercises.visitor;

public class Fruit implements Element{
    public int weight = 5, pricePerKg = 10;

    public int accept(Visitor visitor){
        return visitor.visit(this);
    }
}
