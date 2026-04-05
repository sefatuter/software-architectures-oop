package com.lesson.my_exercises.pattern_examples.q5;

public abstract class AbstractFactory {
    abstract Button getButton(String type);
    abstract CheckBox getCheckbox(String type);
}
