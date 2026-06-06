package com.lesson.my_exercises.visitor;

public interface Visitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
