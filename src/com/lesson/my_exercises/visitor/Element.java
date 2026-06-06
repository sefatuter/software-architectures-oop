package com.lesson.my_exercises.visitor;

public interface Element {
    int accept(Visitor visitor);
}
