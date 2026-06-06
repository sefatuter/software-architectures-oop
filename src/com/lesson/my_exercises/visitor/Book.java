package com.lesson.my_exercises.visitor;

public class Book implements Element {
    public int price = 100;

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
